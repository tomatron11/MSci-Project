import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*;
import java.util.HashMap;

import javax.lang.model.element.Modifier;

import java.lang.Class.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.ClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import javassist.*;
import javassist.ClassPool;
import javassist.CtClass;
import java.lang.reflect.Field;
import java.lang.invoke.MethodHandles.Lookup;
/**
 * Backend plugin for the Garage language
 */
public class ValueUserPlugin implements ValueUserPluginInterface {
  public HashMap<String, Class> nameToClass = new HashMap<String, Class>(); // Holds classes
  public HashMap<String, Object> nameToObject = new HashMap<String, Object>(); // Holds objects

  
  /** 
   * @return String
   */
  @Override
  public String name() {
      return "Garage Plugin";
  }

  
  /** 
   * @param args
   * @return Value
   * @throws ARTException
   * Performs string analysis to perform correct operation
   */
  @Override
  public Value user(Value... args) throws ARTException {
    // Performs a function depending on the corresponding eSOS statement
    switch (args[0].value().toString()) {
      case "subClass":
        newClass(args);
        break;
      case "object":
        newObject(args);
        break;
      case "printToFile":
        printToFile(args);
        break;
    }
    return new __done();
  }

  
  /** 
   * @param args
   * Creates new class object
   */
  public void newClass(Value... args) {
    try {
    switch (args[2].value().toString()) {
      case "Vehicle":
        ClassPool pool = ClassPool.getDefault();
        CtClass subClass = pool.makeClass(args[1].value().toString());
        subClass.defrost();
        final CtClass superClass = pool.get(Vehicle.class.getName());
        subClass.setSuperclass(superClass);
        subClass.setModifiers(Vehicle.class.getModifiers());
        CtField wls = CtField.make("public static int wheels;", subClass); // Adds wheels field
        subClass.addField(wls);
        CtField drs = CtField.make("public static int doors;", subClass); // Adds doors field
        subClass.addField(drs);
        Class cls = pool.toClass(subClass, this.getClass());
        Field wheels = cls.getField("wheels");
        wheels.setAccessible(true);
        wheels.set(null, (int) args[3].value()); // Sets wheels to argument
        Field doors = cls.getField("doors");
        doors.setAccessible(true);
        doors.set(null, (int) args[4].value()); // Sets doors to argument
        nameToClass.put(args[1].value().toString(), cls);
    } 
    } catch (ARTException | IllegalAccessException | CannotCompileException | NotFoundException |
    NoSuchFieldException e) { e.printStackTrace(); }
  }

  
  /** 
   * @param args
   * Derives object from class
   */
  public void newObject(Value... args) {
    try {
      Class cls = nameToClass.get(args[2].value().toString());
      Object obj = cls.getDeclaredConstructor(String.class, String.class).newInstance(args[3].value().toString(),
      args[4].value().toString()); // Reflectively calls constructor
      nameToObject.put(args[1].value().toString(), obj);
    } catch (ARTException | NoSuchMethodException | InstantiationException | IllegalAccessException | 
    InvocationTargetException e) { e.printStackTrace(); }
  }

  
  /** 
   * @param args
   * Prints object to outputFile.txt
   */
  public void printToFile(Value... args) {
    try {
      File file = new File("C:\\Users\\tomwi\\Documents\\Final Year Project\\PROJECT\\Classes Implementation\\Garage\\outputFile.txt");
      if (!file.exists()) { file.createNewFile(); }
      Object obj = nameToObject.get(args[1].value().toString()); 
      Class cls = obj.getClass();
      Field doors = cls.getField("doors"); // Gets fields reflectively
      Field wheels = cls.getField("wheels");
      Field name = cls.getField("name");
      Field colour = cls.getField("colour");
      String str = "[" + name.get(obj).toString() + "," + colour.get(obj).toString() + "," + doors.get(obj).toString() + "," + 
      wheels.get(obj).toString() + "] ";
      FileWriter writer = new FileWriter(file, true);
      writer.write(str);
      writer.close();
    } catch (ARTException | IOException | NoSuchFieldException | IllegalAccessException e) { e.printStackTrace(); }
  }
}
