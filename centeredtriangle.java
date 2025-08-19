import java.util.Scanner;
class CenteredTriangle {
 public static void main(String[] args) {
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 
 for (int i = 1; i <= n; i++) {
 // Print leading spaces for centering
 for (int k = 1; k <= (n - i); k++) {
 System.out.print(" ");
 }
 // Print numbers
 for (j = 1; j <= i; j++) {
 System.out.print(" " + i);
 }
 System.out.println("");
 }
 }
}