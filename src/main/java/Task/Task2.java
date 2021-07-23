package Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * There is a Cat class with a String variable name, int variable age.
 * <p>
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 * <p>
 * Get a Set of all cats from the Map and display it on the screen.
 * <p>
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Cat> map = createMap();
        Set<Cat> cats = convertMapToSet(map);
        printCats(cats);
    }
    public static Map<Integer, Cat> createMap() {
        Map<Integer, Cat> map = new HashMap <Integer, Cat>();
        for(int i = 0; i<10; i++) {
            Cat cat = new Cat();
            cat.setName("name"+i);
            cat.setAge(i);
            map.put(i, cat);
        }
        return map;
    }
    public static Set<Cat> convertMapToSet(Map<Integer, Cat> map) {
        Set<Cat> cats = new HashSet();
        for(Integer i : map.keySet()) {
            cats.add(map.get(i));
        }
        return cats;
    }
    public static void printCats(Set<Cat> cats) {
        for(Cat cat : cats) {
            System.out.println(cat.getName() + " - " + cat.getAge());
        }
    }
    public static class Cat {
        public String name;
        public int age;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}





