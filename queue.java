private static final int MAX = 4;
 private int[] queue;
 private int front;
 private int rear;
 
 // Constructor to initialize the queue
 public QueueUsingArray() {
 queue = new int[MAX];
 front = -1;
 rear = -1;
 }
 
 // Method to add an element to the queue (enqueue)
 public void enqueue(int val) {
 if (rear == MAX - 1) {
 	System.out.println("Queue Overflow");
 return;
 }
 if (front == -1) {
 front = 0;
 }
 queue[++rear] = val;
 System.out.println("Enqueued: " + val);
 }
 
 // Method to remove an element from the queue (dequeue)
 public int dequeue() {
 if (front == -1 || front > rear) {
 System.out.println("Queue Underflow");
 return -1;
 }
 return queue[front++];
 }
 
 // Method to display the queue elements
 public void display() {
 if (front == -1 || front > rear) {
 System.out.println("Queue is Empty");
 return;
 }
 System.out.print("Queue: ");
 for (int i = front; i <= rear; i++) {
 System.out.print(queue[i] + " ");
 }
 System.out.println();
 }
 
 // Method to check if queue is empty
 public boolean isEmpty() {
 return (front == -1 || front > rear);
 }
 
 // Method to check if queue is full
 public boolean isFull() {
 return (rear == MAX - 1);
 }
 
 // Method to peek at the front element without removing it
 public int peek() {
 if (isEmpty()) {
 	System.out.println("Queue is Empty");
 return -1;
 }
 return queue[front];
 }
 
 // Main method to test the queue implementation
 public static void main(String[] args) {
 QueueUsingArray queue = new QueueUsingArray();
 
 System.out.println("=== Queue Implementation Using Arrays ===\n");
 
 // Enqueue elements
 queue.enqueue(10);
 queue.enqueue(20);
 queue.enqueue(30);
 queue.enqueue(40);
 
 // Display queue
 queue.display();
 
 // Dequeue element
 int dequeuedValue = queue.dequeue();
 System.out.println("Dequeued: " + dequeuedValue);
 
 // Display queue after dequeue
 queue.display();
 
 // Try to enqueue when queue is full
 queue.enqueue(50);
 
 // Additional operations
 System.out.println("\nAdditional Operations:");
 System.out.println("Is queue empty? " + queue.isEmpty());
 System.out.println("Is queue full? " + queue.isFull());
 System.out.println("Front element: " + queue.peek());
 }
