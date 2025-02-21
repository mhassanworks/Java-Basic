import java.util.Scanner; // Import Scanner for user input

public class Main {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        // Print the user input
        System.out.println("Welcome, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
