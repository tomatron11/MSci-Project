package zooPackage;

import java.util.List;
import java.util.LinkedList;
import java.lang.Class.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.reflect.Method;

import zooPackage.GenericAnimal.Sex;
import zooPackage.Lion.LionType;
import zooPackage.Monkey.MonkeyType;
import zooPackage.Elephant.ElephantType;

/**
 * Class which provides the command line interface and the reflective methods
 */

public class ReflectiveZoo {


    /** 
     * @param obj
     * @return Field[]
     * Gets fields of given object reflectively
     * Taken from Java Reflection in Action by Ira and Nate Forman
     */
    public static Field[] getFields(Object obj) {
        Class cls = obj.getClass();
        List accum = new LinkedList();
        while (cls != null) {
            Field[] f = cls.getDeclaredFields();
            for (int i = 0; i < f.length; i++) {
                accum.add(f[i]);
            }
            cls = cls.getSuperclass();
        }
        Field[] allFields = (Field[]) accum.toArray(new Field[accum.size()]);
        return allFields;
    }

    
    /** 
     * @param fields
     * Prints to terminal descriptions of fields in fields array
     */
    public static void printFields(Field[] fields) {
        for (int i = 0; i < fields.length; i++) {
            String field = fields[i].toString();
            System.out.println("Field: " + field);
        }
    }

    
    /** 
     * @param fields
     * Sets fields in fields array to be accessible
     */
    public static void setAccessibleFields(Field[] fields) {
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
        }
    }

    
    /** 
     * @param fields
     * Sets fields in fields array to be non-accessible
     */
    public static void setNonAccessibleFields(Field[] fields) {
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(false);
        }
    }

    
    /** 
     * @param fields
     * @param obj
     * @return List
     * Gets raw values for object in each field in fields array
     */
    public static List getValues(Field[] fields, Object obj) {
        List values = new LinkedList();
        for (int i = 0; i < fields.length; i++) {
            try {
            values.add(fields[i].get(obj)); // Gets raw value and adds to list
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return values;
    }

    
    /** 
     * @param name
     * @param weight
     * @param sex
     * @param colour
     * @param type
     * @return Monkey
     * Creates new Monkey object reflectively
     */
    public static Monkey newMonkeyReflect(String name, int weight, Sex sex, String colour, MonkeyType type) {
        try { 
            Monkey monkey = Monkey.class.getDeclaredConstructor().newInstance(); // Finds constructor for class and creates new instance
            monkey.getClass().getDeclaredMethod("setName", String.class).invoke(monkey, name);
            monkey.getClass().getDeclaredMethod("setWeight", int.class).invoke(monkey, weight);
            monkey.getClass().getDeclaredMethod("setSex", Sex.class).invoke(monkey, sex);
            monkey.getClass().getDeclaredMethod("setColour", String.class).invoke(monkey, colour);
            monkey.getClass().getDeclaredMethod("setType", MonkeyType.class).invoke(monkey, type);
            return monkey;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) { 
            e.printStackTrace(); 
        }
        return null;
    }

    
    /** 
     * @param name
     * @param weight
     * @param sex
     * @param colour
     * @param type
     * @return Lion
     * Creates new Lion object reflectively
     */
    public static Lion newLionReflect(String name, int weight, Sex sex, String colour, LionType type) {
        try { 
            Lion lion = Lion.class.getDeclaredConstructor().newInstance(); // Finds constructor for class and creates new instance
            lion.getClass().getDeclaredMethod("setName", String.class).invoke(lion, name);
            lion.getClass().getDeclaredMethod("setWeight", int.class).invoke(lion, weight);
            lion.getClass().getDeclaredMethod("setSex", Sex.class).invoke(lion, sex);
            lion.getClass().getDeclaredMethod("setColour", String.class).invoke(lion, colour);
            lion.getClass().getDeclaredMethod("setType", LionType.class).invoke(lion, type);
            return lion;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) { 
            e.printStackTrace(); 
        }
        return null;
    }

    
    /** 
     * @param name
     * @param weight
     * @param sex
     * @param colour
     * @param type
     * @return Elephant
     * Creates new Elephant object reflectively
     */
    public static Elephant newElephantReflect(String name, int weight, Sex sex, String colour, ElephantType type) {
        try { 
            Elephant elephant = Elephant.class.getDeclaredConstructor().newInstance(); // Finds constructor for class and creates new instance
            elephant.getClass().getDeclaredMethod("setName", String.class).invoke(elephant, name);
            elephant.getClass().getDeclaredMethod("setWeight", int.class).invoke(elephant, weight);
            elephant.getClass().getDeclaredMethod("setSex", Sex.class).invoke(elephant, sex);
            elephant.getClass().getDeclaredMethod("setColour", String.class).invoke(elephant, colour);
            elephant.getClass().getDeclaredMethod("setType", ElephantType.class).invoke(elephant, type);
            return elephant;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) { 
            e.printStackTrace(); 
        }
        return null;
    }

    
    /** 
     * main function implementing command line interface
     */
    public static void main(String args[]) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Zoo Interface: Choose command");
            String command = scanner.nextLine();
            switch (command) {
                case "new animal":
                    System.out.println("Choose type of animal");
                    String animal = scanner.nextLine();
                    System.out.println("Enter name");
                    String name = scanner.nextLine();
                    System.out.println("Enter weight");
                    int weight = Integer.valueOf(scanner.nextLine());
                    System.out.println("Enter sex");
                    String sex_value = scanner.nextLine();
                    Sex sex;
                    if (sex_value.equals("male")) { sex = Sex.MALE; } 
                    else { sex = Sex.FEMALE; }
                    System.out.println("Enter colour");
                    String colour = scanner.nextLine();
                    if (animal.equals("monkey")) {
                        System.out.println("Enter monkey type");
                        String type_value = scanner.nextLine();
                        MonkeyType type;
                        if (type_value.equals("chimp")) { type = MonkeyType.CHIMP; }
                        else if (type_value.equals("gorilla")) { type = MonkeyType.GORILLA; }
                        else { type = MonkeyType.ORANGUTAN; }
                        Monkey monkey = newMonkeyReflect(name, weight, sex, colour, type);
                        zoo.addMonkey(monkey);
                        System.out.println("Monkey added");
                        break;
                    } else if (animal.equals("lion")) {
                        System.out.println("Enter lion type");
                        String type_value = scanner.nextLine();
                        LionType type;
                        if (type_value.equals("white")) { type = LionType.WHITE; }
                        else if (type_value.equals("asian")) { type = LionType.ASIAN; }
                        else { type = LionType.AFRICAN; }
                        Lion lion = newLionReflect(name, weight, sex, colour, type);
                        zoo.addLion(lion);
                        System.out.println("Lion added");
                        break;
                    } else if (animal.equals("elephant")) {
                        System.out.println("Enter elephant type");
                        String type_value = scanner.nextLine();
                        ElephantType type;
                        if (type_value.equals("asian")) { type = ElephantType.ASIAN; }
                        else { type = ElephantType.AFRICAN; }
                        Elephant elephant = newElephantReflect(name, weight, sex, colour, type);
                        zoo.addElephant(elephant);
                        System.out.println("Elephant added");
                        break;
                    } else { System.out.println("Invalid animal"); }
                case "get monkeys":
                    System.out.println(zoo.getMonkeyEnclosure());
                    break;
                case "get lions":
                    System.out.println(zoo.getLionEnclosure());
                    break;
                case "get elephants":
                    System.out.println(zoo.getElephantEnclosure());
                    break;
                case "remove monkey":
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    zoo.removeMonkey(name);
                    System.out.println(name + " removed");
                    break;
                case "remove lion":
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    zoo.removeLion(name);
                    System.out.println(name + " removed");
                    break;
                case "remove elephant":
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    zoo.removeElephant(name);
                    System.out.println(name + " removed");
                    break;
                case "exit":
                    scanner.close();
                case "get fields":
                    System.out.println("Enter type of animal");
                    String type = scanner.nextLine();
                    System.out.println("Enter name");
                    name = scanner.nextLine();
                    if (type.equals("monkey")) {
                        Monkey monkey = zoo.findMonkey(name);
                        Field[] fields = getFields(monkey);
                        printFields(fields);
                        System.out.println(getValues(fields, monkey));
                        break;
                    } else if (type.equals("lion")) {
                        Lion lion = zoo.findLion(name);
                        Field[] fields = getFields(lion);
                        printFields(fields);
                        System.out.println(getValues(fields, lion));
                        break;
                    } else if (type.equals("elephant")) {
                        Elephant elephant = zoo.findElephant(name);
                        Field[] fields = getFields(elephant);
                        printFields(fields);
                        System.out.println(getValues(fields, elephant));
                        break;
                    }
                case "set field":
                    System.out.println("Enter type of animal");
                    animal = scanner.nextLine();
                    System.out.println("Enter name of animal");
                    name = scanner.nextLine();
                    System.out.println("Enter field to change");
                    String field_val = scanner.nextLine();
                    System.out.println("Enter value to change it to");
                    String value = scanner.nextLine();
                    try {
                    if (animal.equals("monkey")) {
                        Monkey monkey = zoo.findMonkey(name);
                        Field[] fields = getFields(monkey);
                        setAccessibleFields(fields);
                        Field field = fields[0]; // Gets first name field
                        switch(field_val) {
                            case "name":
                                field.set(monkey, value);
                                break;
                            case "weight":
                                field = fields[1]; // Gets second weight field
                                field.set(monkey, Integer.parseInt(value));
                                break;
                            case "colour":
                                field = fields[3]; // Gets fourth colour field
                                field.set(monkey, value);
                        setNonAccessibleFields(fields);
                        break;
                        }

                    } else if (animal.equals("lion")) {
                        Lion lion = zoo.findLion(name);
                        Field[] fields = getFields(lion);
                        setAccessibleFields(fields);
                        Field field = fields[0]; // Gets first name field
                        switch(field_val) {
                            case "name":
                                field.set(lion, value);
                                break;
                            case "weight":
                                field = fields[1]; // Gets second weight field
                                field.set(lion, Integer.parseInt(value));
                                break;
                            case "colour":
                                field = fields[3]; // Gets fourth colour field
                                field.set(lion, value);
                        setNonAccessibleFields(fields);
                        break;
                        }

                    } else if (animal.equals("elephant")) {
                        Elephant elephant = zoo.findElephant(name);
                        Field[] fields = getFields(elephant);
                        setAccessibleFields(fields);
                        Field field = fields[0]; // Gets first name field
                        switch(field_val) {
                            case "name":
                                field.set(elephant, value);
                                break;
                            case "weight":
                                field = fields[1]; // Gets second weight field
                                field.set(elephant, Integer.parseInt(value));
                                break;
                            case "colour":
                                field = fields[3]; // Gets fourth colour field
                                field.set(elephant, value);
                        setNonAccessibleFields(fields);
                        break;
                        }

                    }
                    } catch (IllegalArgumentException | IllegalAccessException e) { 
                        e.printStackTrace(); 
                    }
                }
        }
    }
}