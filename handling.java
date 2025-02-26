import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Displaying user input
        System.out.println("Welcome, " + name + "!");
        
        // Closing scanner
        scanner.close();
    }
}
