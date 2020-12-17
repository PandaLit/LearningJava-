//Write a program with String variables: firstName, middleName. and lastName. Char variables: firstInitial, middleIntial, lastIntial
import java.util.Scanner;

   public class question2 {


      public static void main(String [] args) {
   
         String firstName;
         String middleName;
         String lastName;
         char firstInitial;
         char middleIntital;
         char lastInitial;

      
         Scanner keyboard = new Scanner(System.in);
           
           System.out.println("First Name: ");
            firstName = keyboard.nextLine();
            firstInitial = firstName.charAt(0);
           System.out.println("Middle Name: ");
            middleName = keyboard.nextLine();
            middleIntital = middleName.charAt(0);
           System.out.println("Last Name: ");
            lastName = keyboard.nextLine();
            lastInitial = lastName.charAt(0);
           
            
            
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
            System.out.println("First Initial: " + firstInitial);
            System.out.println("Middle Initial: " + middleIntital);
            System.out.println("Last Initial: " + lastInitial);
         
      
   
      }
   
   }