package zooPackage;

/**
 * Class representing a Monkey
 * Implements GenericAnimal template
 * Provides getters and setters as well as a toString method
 */
public class Monkey implements GenericAnimal {
    public String name;
    public int weight;
    public Sex sex;
    public String colour;
    public MonkeyType type;

    public enum MonkeyType {
        CHIMP,
        GORILLA,
        ORANGUTAN
    }

    public Monkey(String name, int weight, Sex sex, String colour, MonkeyType type) {
        this.setName(name);
        this.setWeight(weight);
        this.setSex(sex);
        this.setColour(colour);
        this.setType(type);
    }

    public Monkey() {}

    public void setName(String name) { this.name = name; }

    public String getName() { return this.name; }

    public void setWeight(int weight) { this.weight = weight; }

    public int getWeight() { return this.weight; }

    public void setSex(Sex sex) { this.sex = sex; }

    public Sex getSex() { return this.sex; }

    public void setColour(String colour) { this.colour = colour; }

    public String getColour() { return this.colour; }

    public void setType(MonkeyType type) { this.type = type; }

    public MonkeyType getType() { return this.type; }

    public String toString() {
        return "Name: " + this.name + " Weight: " + this.weight + " Sex: " + this.sex + " Colour: " + this.colour + " Type: " + this.type;
    }
}