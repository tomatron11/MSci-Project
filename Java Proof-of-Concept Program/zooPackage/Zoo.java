package zooPackage;
import zooPackage.GenericAnimal.Sex;
import zooPackage.Lion.LionType;
import zooPackage.Monkey.MonkeyType;
import zooPackage.Elephant.ElephantType;

import java.util.List;
import java.util.ArrayList;

/**
 * Class representing a zoo of animals
 * Contains array lists representing each type of animal's enclosure
 * Allows for adding, removing and find of animals
 */
public class Zoo {
    List<Monkey> monkeyEnclosure = new ArrayList();
    List<Lion> lionEnclosure = new ArrayList();
    List<Elephant> elephantEnclosure = new ArrayList();

    public void addMonkey(Monkey monkey) { monkeyEnclosure.add(monkey); }
    public void addLion(Lion lion) { lionEnclosure.add(lion); }
    public void addElephant(Elephant elephant) { elephantEnclosure.add(elephant); }
    
    
    /** 
     * @param name
     */
    public void removeMonkey(String name) { 
        for (int i = 0; i < monkeyEnclosure.size(); i++) {
            if (monkeyEnclosure.get(i).getName().equals(name)) {
                monkeyEnclosure.remove(monkeyEnclosure.get(i));
            }
        }
    }
    
    /** 
     * @param name
     */
    public void removeLion(String name) { 
        for (int i = 0; i < lionEnclosure.size(); i++) {
            if (lionEnclosure.get(i).getName().equals(name)) {
                lionEnclosure.remove(lionEnclosure.get(i));
            }
        }
     }
    
    /** 
     * @param name
     */
    public void removeElephant(String name) { 
        for (int i = 0; i < elephantEnclosure.size(); i++) {
            if (elephantEnclosure.get(i).getName().equals(name)) {
                elephantEnclosure.remove(elephantEnclosure.get(i));
            }
        }
     }

    
    /** 
     * @param name
     * @return Monkey
     */
    public Monkey findMonkey(String name) {
        for (int i = 0; i < monkeyEnclosure.size(); i++) {
            if (monkeyEnclosure.get(i).getName().equals(name)) {
                return monkeyEnclosure.get(i);
            }
        }
        return null;
    }

    
    /** 
     * @param name
     * @return Lion
     */
    public Lion findLion(String name) {
        for (int i = 0; i < lionEnclosure.size(); i++) {
            if (lionEnclosure.get(i).getName().equals(name)) {
                return lionEnclosure.get(i);
            }
        }
        return null;
    }

    
    /** 
     * @param name
     * @return Elephant
     */
    public Elephant findElephant(String name) {
        for (int i = 0; i < elephantEnclosure.size(); i++) {
            if (elephantEnclosure.get(i).getName().equals(name)) {
                return elephantEnclosure.get(i);
            }
        }
        return null;
    }

    public List<Monkey> getMonkeyEnclosure() { return monkeyEnclosure; }
    public List<Lion> getLionEnclosure() { return lionEnclosure; }
    public List<Elephant> getElephantEnclosure() { return elephantEnclosure; }
}
