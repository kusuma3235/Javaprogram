public class linked {
// Define the node class
static class Node {
 int data;
 Node next;
 
 // Constructor to initialize a node
 Node(int data) {
 this.data = data;
 this.next = null;
 }
}
// Head of the linked list
private Node head;
public linked() {
 head = null;
}
// Function to insert a node at the beginning
public void insertAtBegin(int data) {
 // Create a new node
 Node newNode = new Node(data);
 
 // Link the new node to the current head
 newNode.next = head;
 
 // Update the head to point to the new node
 head = newNode;
}
// Function to display the linked list
public void displayList() {
 Node temp = this.head;
 System.out.print("Linked list: ");
 
 while (temp != null) {
 System.out.print(temp.data + " -> ");
 temp = temp.next;
 }
 System.out.println("NULL");
}
// Main method to test the linked list
public static void main(String[] args) {
 // Create a new linked list instance
 linked l = new linked();
 
 // Insert nodes at the beginning
}
}
}