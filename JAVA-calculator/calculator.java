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


// using fn
// import java.util.Scanner;

// public class Calculator {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = scanner.nextInt();

//         System.out.print("Enter second number: ");
//         int b = scanner.nextInt();

//         System.out.println("Choose an operation: ");
//         System.out.println("1. Add");
//         System.out.println("2. Subtract");
//         System.out.println("3. Multiply");
//         System.out.println("4. Divide");

//         int choice = scanner.nextInt();

//         int result = 0;

//         switch (choice) {
//             case 1:
//                 result = add(a, b);
//                 break;
//             case 2:
//                 result = subtract(a, b);
//                 break;
//             case 3:
//                 result = multiply(a, b);
//                 break;
//             case 4:
//                 result = divide(a, b);
//                 break;
//             default:
//                 System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
//                 scanner.close();
//                 return;  // Exit the program
//         }

//         System.out.println("Result: " + result);
//         scanner.close();
//     }

//     // Function to add two numbers
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     // Function to subtract two numbers
//     public static int subtract(int a, int b) {
//         return a - b;
//     }

//     // Function to multiply two numbers
//     public static int multiply(int a, int b) {
//         return a * b;
//     }

//     // Function to divide two numbers, with error handling for division by zero
//     public static int divide(int a, int b) {
//         if (b != 0) {
//             return a / b;
//         } else {
//             System.out.println("Error! Division by zero.");
//             return 0;  // Returning 0 or any other error code
//         }
//     }
// }


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
