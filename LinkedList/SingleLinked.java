package LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SingleLinked {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete from beginning
    void delete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Display linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinked list = new SingleLinked(); // Corrected

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("Linked List: ");
        list.display();

        // Delete element
        list.delete();
        System.out.print("After deletion: ");
        list.display();
    }
}
