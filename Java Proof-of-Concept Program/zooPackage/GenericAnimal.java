package zooPackage;

/**
 * Generic interface for the animal classes
 * Specifies their required methods
 */
public interface GenericAnimal {

    public enum Sex {
        MALE,
        FEMALE
    }

    public void setName(String name);

    public String getName();

    public void setSex(Sex sex);

    public Sex getSex();

    public void setWeight(int weight);

    public int getWeight();

    public void setColour(String colour);

    public String getColour();

    public String toString();
}