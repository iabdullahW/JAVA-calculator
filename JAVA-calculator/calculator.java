// java 12+
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.println("Choose an operation: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int choice = scanner.nextInt();

            int result = switch (choice) {
                case 1 -> a + b;  // Addition
                case 2 -> a - b;  // Subtraction
                case 3 -> a * b;  // Multiplication
                case 4 -> {
                    if (b != 0) {  // Check to avoid division by zero
                        yield a / b;  // Division
                    } else {
                        System.out.println("Error! Division by zero.");
                        yield 0;  // Returning 0 or any other error code
                    }
                }
                default -> {
                    System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
                    yield 0;  // Returning 0 or any other error code
                }
            };

            System.out.println("Result: " + result);
        }
    }
}


// easy
// import java.util.Scanner;  // Import the Scanner class to read input

// public class Calculator {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  // Create a Scanner object

//         System.out.print("Enter first number: ");
//         int a = scanner.nextInt();  // Read the first number

//         System.out.print("Enter second number: ");
//         int b = scanner.nextInt();  // Read the second number

//         System.out.println("Choose an operation: ");
//         System.out.println("1. Add");
//         System.out.println("2. Subtract");
//         System.out.println("3. Multiply");
//         System.out.println("4. Divide");

//         int choice = scanner.nextInt();  // Read the user's choice

//         int result = 0;  // Variable to store the result

//         switch (choice) {
//             case 1:
//                 result = a + b;  // Addition
//                 System.out.println("Result: " + result);
//                 break;
//             case 2:
//                 result = a - b;  // Subtraction
//                 System.out.println("Result: " + result);
//                 break;
//             case 3:
//                 result = a * b;  // Multiplication
//                 System.out.println("Result: " + result);
//                 break;
//             case 4:
//                 if (b != 0) {  // Check to avoid division by zero
//                     result = a / b;  // Division
//                     System.out.println("Result: " + result);
//                 } else {
//                     System.out.println("Error! Division by zero.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
//         }

//         scanner.close();  // Close the scanner object
//     }
// }
