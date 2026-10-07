import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;

public class collections_pg {
  public static void main(String[] args) {
    // // Collection
    // // List
    // // ArrayList
    // // LinkedList

    // int a[] = { 10, 20 };

    // ArrayList<Integer> c1 = new ArrayList<>();

    // c1.add(90);
    // c1.add(50);
    // c1.add(30);
    // c1.add(00);

    // System.out.println(c1.get(0));

    // // c1.remove(2);

    // // c1.add(0, 80);

    // // System.out.println(c1.get(0));
    // // System.out.println(c1.get(1));

    // // for(int i=0;i<a.length;i++){
    // // System.out.println(a[i]);

    // // }
    // for (int i = 0; i < c1.size(); i++) {
    // System.out.println(c1.get(i));
    // }

    // ArrayDeque<Integer> n1 = new ArrayDeque<>();
    // // array fixed

    // n1.add(90);
    // n1.add(200);
    // n1.add(10);
    // n1.add(40);

    // System.out.println(n1.peek());

    // System.out.println(n1.poll());
    // System.out.println(n1);

    // HashSet<Integer> n2 = new HashSet<>();

    // n2.add(90);
    // n2.add(90);
    // n2.add(90);
    // n2.add(60);

    // System.out.println(n2);

    // HashMap<Integer, String> n3 = new HashMap<>();

    // n3.put(101, "st1");
    // n3.put(102, "st2");
    // n3.put(103, "st3");
    // n3.put(103, "st4");

    // System.out.println(n3.get(101));
    // System.out.println(n3);

    // LinkedList<String> n4 = new LinkedList<>();
    // n4.add("we");
    // n4.add("they");
    // n4.remove(1);
    // n4.addFirst("them");
    // System.out.println(n4);

    // LinkedBlockingDeque<Integer> n5 = new LinkedBlockingDeque<>();
    // n5.add(7);
    // n5.addLast(6);
    // n5.add(5);
    // n5.remove();
    // System.out.println(n5);

    // LinkedHashSet<Integer> n6 = new LinkedHashSet<>();
    // n6.add(33);
    // n6.add(66);
    // n6.add(33);
    // System.out.println(n6);

    // LinkedHashMap<Integer, String> n7 = new LinkedHashMap<>();
    // n7.put(1, "nuhhsll");
    // n7.put(22, "kkkl");
    // System.out.println(n7.get(22));

    // TreeSet<Integer> n8 = new TreeSet<>();
    // n8.add(22);
    // n8.add(11);
    // System.out.println(n8);

    // TreeMap<Integer, String> n9 = new TreeMap<>();
    // n9.put(7, "ver");
    // n9.put(1, "lkg");
    // System.out.println(n9);
    // List<Integer>numbers = Arrays.asList(10,15,20,25,30);
    // numbers.stream().filter(n-> n > 20).forEach(n -> System.out.println(n));

    // ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(3);
    // numbers.add(5);
    // numbers.add(1);
    // numbers.add(9);
    // numbers.add(3);
    // numbers.add(2);
    // System.out.println(numbers);

    // Sort the list
    // Collections.sort(numbers);
    // System.out.println("Sorted: " + numbers); // [1, 2, 3, 5, 9]

    // Reverse the list
    // Collections.reverse(numbers);
    // System.out.println("Reversed: " + numbers); // [9, 5, 3, 2, 1]

    // Shuffle the list
    // Collections.shuffle(numbers);
    // System.out.println("Shuffled: " + numbers);

    // Find max and min
    // System.out.println("Max: " + Collections.max(numbers));
    // System.out.println("Min: " + Collections.min(numbers));

    // Frequency of 3
    // System.out.println("Frequency of 3: " + Collections.frequency(numbers, 3));

    // Queue<String> queue = new ArrayDeque<>();

    // Enqueue (add elements)
    // queue.add("Apple");
    // queue.add("Banana");
    // queue.add("Cherry");

    // System.out.println("Queue: " + queue);

    // Peek (see front element)
    // System.out.println("Front element: " + queue.peek());

    // Dequeue (remove front element)
    // System.out.println("Removed: " + queue.poll());
    // System.out.println("Queue after removal: " + queue);

    // Size
    // System.out.println("Size: " + queue.size());

    // Check empty
    // System.out.println("Is empty? " + queue.isEmpty());
    List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Avocado");

    // Filter fruits starting with 'A' and convert to uppercase
    List<String> result = fruits.stream()
        .filter(f -> f.startsWith("A")) 
        .map(String::toUpperCase) 
        .collect(Collectors.toList()); 

    System.out.println(result);
  }
}
