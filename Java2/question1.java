//Java Programming challenges: Write String variable with name, int variable named age, double variable named annualPay
import java.util.Scanner;

   public class question1 {
   
      public static void main(String [] args) {
      
               
       String name;
       int age;
       double annualPay;
       
       //Creates a way to input an object into the system/program/computer
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Enter Name:");
         name = keyboard.nextLine();
       System.out.println("Age:");
         age = keyboard.nextInt();
       System.out.println("Annual Income:");
         annualPay = keyboard.nextDouble();
         
       System.out.println("Name:" + name);
       System.out.println("Age:" + age);
       System.out.println("Annual Income:" + annualPay);
       
       }   
   }