package Anotherfolder;
import java.util.HashMap;

public class hashmap {

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> scores = new HashMap<>();

        // Add key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Access a value using its key
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Check if a key exists
        if (scores.containsKey("Bob")) {
            System.out.println("Bob's score: " + scores.get("Bob"));
        }

        // Iterate through the HashMap
        System.out.println("\nAll scores:");
        for (String name : scores.keySet()) {
            System.out.println(name + " -> " + scores.get(name));
        }

        // Remove a key-value pair
        scores.remove("Charlie");
        System.out.println("\nAfter removing Charlie: " + scores);
    }
}

    
}
