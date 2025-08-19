int data;
 Node left, right;
 
 public Node(int data) {
 this.data = data;
 this.left = this.right = null;
 }
}
public class BST_WithDelete {
 private Node root;
 
 public BST_WithDelete() {
 root = null;
 }
 
 // Function to insert a new node into the BST
 public Node insert(Node root, int data) {
 if (root == null) {
 return new Node(data);
 }
 
 if (data < root.data) {
 root.left = insert(root.left, data);
 } else if (data > root.data) {
 root.right = insert(root.right, data);
 }
 
 return root;
 }
 
 // Function to find the minimum value node in a subtree
 public Node minValueNode(Node node) {
 Node current = node;
 
 while (current != null && current.left != null) {
 current = current.left;
 }
 
 return current;
 }
 
 // Function to delete a node from the BST
 public Node deleteNode(Node root, int key) {
 if (root == null) {
 return root;
 }
 
 if (key < root.data) {
 root.left = deleteNode(root.left, key);
 else if (key > root.data) {
 root.right = deleteNode(root.right, key);
 } else {
 // Node with only one child or no child
 if (root.left == null) {
 return root.right;
 } else if (root.right == null) {
 return root.left;
 }
 
 // Node with two children: Get the inorder successor
 Node temp = minValueNode(root.right);
 root.data = temp.data;
 root.right = deleteNode(root.right, temp.data);
 }
 
 return root;
 }
 
 // Function to perform in-order traversal of the BST
 public void inorder(Node root) {
 if (root != null) {
 inorder(root.left);
 System.out.print(root.data + " ");
 inorder(root.right);
 }
 }
 
 public static void main(String[] args) {
 BST_WithDelete bst = new BST_WithDelete();
 int[] values = {50, 30, 20, 40, 70, 60, 80};
 
 // Insert values into the BST
 for (int value : values) {
 bst.root = bst.insert(bst.root, value);
 }
 
 // Display in-order traversal before deletion
 System.out.print("In-order traversal before deletion: ");
 bst.inorder(bst.root);
 System.out.println();
 
 bst.root = bst.deleteNode(bst.root, 20);
 System.out.print("In-order traversal after deleting 20: ");
 bst.inorder(bst.root);
 }
 }