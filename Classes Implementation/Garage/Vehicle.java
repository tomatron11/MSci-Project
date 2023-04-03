/**
 * Vehicle class to be inherited from
 */
public class Vehicle {
    public String colour;
    public String name;

    public Vehicle(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void setName(String name) { this.name = name; }
    public void setColour(String colour) { this.colour = colour; }

    public String getName() { return this.name; }
    public String getColour() { return this.colour; }
}