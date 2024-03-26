import java.util.Scanner;

public class policy
 {
    public static void main(String[] arg) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine(); 
        
        System.out.println("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();
        
        System.out.println("Please enter the Policyholders First Name: ");
        String firstName = keyboard.nextLine();
        
        System.out.println("Please enter the Policyholders Last Name: ");
        String lastName = keyboard.nextLine();
        
        System.out.println("Please enter the Policyholders Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); 
        
        System.out.println("Please enter the Policyholders Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();
        
        System.out.println("Please enter the Policyholders Height (in inches): ");
        double height = keyboard.nextDouble();
        
        System.out.println("Please enter the Policyholders Weight (in pounds): ");
        double weight = keyboard.nextDouble();
        
        // Display all gathered information 
        System.out.println("\nCollected Policy Information:");
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Policyholder’s First Name: " + firstName);
        System.out.println("Policyholder’s Last Name: " + lastName);
        System.out.println("Policyholder’s Age: " + age);
        System.out.println("Policyholder’s Smoking Status: " + smokingStatus);
        System.out.println("Policyholder’s Height: " + height + " inches");
        System.out.println("Policyholder’s Weight: " + weight + " pounds");
    }
}
