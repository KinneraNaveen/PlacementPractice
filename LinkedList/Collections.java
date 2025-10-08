package LinkedList;

 import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        // Create LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();
        // Insert elements
        list.add(10);      // Add at end
        list.add(20);
        list.add(30);
        
        // Insert at specific position
        list.add(1, 15);   // Add 15 at index 1

        // Display
        System.out.println("LinkedList: " + list);

        // Remove element
        list.remove(2);   // Removes element at index 2
        System.out.println("After removal: " + list);

        // Get element
        System.out.println("Element at index 1: " + list.get(1));
        // Update element
        list.set(0, 5);   // Replace element at index 0 with 5
        System.out.println("After update: " + list);

        // Iterate using for-each
        System.out.print("Iterating: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
