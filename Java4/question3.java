//Write a program with Name, address, city, state, zip, telephone number, and college major on a single line
import java.util.Scanner;

   public class question3 {
   
      public static void main(String [] args) {
      
         String name;
         String address;
         String city;
         String state;
         int zip;
         long number;
         String major;
         
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("Name: ");
            name = keyboard.nextLine();
         System.out.println("College Major: ");
            major = keyboard.nextLine();
         System.out.println("Address: ");
            address = keyboard.nextLine();        
         System.out.println("City: ");
            city = keyboard.nextLine();
         System.out.println("State: ");
            state = keyboard.nextLine();
         System.out.println("Zip: ");
            zip = keyboard.nextInt();
         System.out.println("Telephone Number: ");
         //Need Long because its greater than or equal to 10 characters!
            number = keyboard.nextLong();
                    
         System.out.println("Student Information: " + name + " , " + address + " , " 
                             + city + " , " + state + " , " + zip + " , " + number + " , " 
                             + major);


      
      
      
      
      }
    }