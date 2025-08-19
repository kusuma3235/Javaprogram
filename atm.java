import java.util.Scanner;
class Main {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int originalpwd=2004;
 for(int i=1;i<=3;i++){
 System.out.print("Enter your current password:");
 int currentpwd=sc.nextInt();
 if(originalpwd==currentpwd){
 int balance=0;
 while(true){
 System.out.println("welcome to SBI ATM");
 System.out.print(" 1) Check Balance\n 2) Deposit\n 3) WithDrawl\n 4) Exit\n ");
 System.out.print("Enter your choice :");
 int choice=sc.nextInt();
 switch(choice){
 case 1:
 System.out.println("your bank balance:" + balance);
 break;
 case 2:
 System.out.print("Deposit your amount :");
 float deposit=sc.nextFloat();
 balance+=deposit;
 break;
 case 3:
 System.out.print("Enter the withdrawal amount :");
 float withdrawl=sc.nextFloat();
 balance-=withdrawl;
 break;
 case 4:
 System.out.print("Thank you for choosing us visit again");
 break;
 default:
 System.out.print("Please enter the valid choice");
 
 }
 if(choice==4){
 break;
 }
 }
 break;
 }
 else{
 if(i != 3){
 System.out.println("You had entered wrong pwd "+ i+" attempt");
 }
 else{
 System.out.print("Timed out.You can try after 24hrs");
 }
 }
 }
 }
}