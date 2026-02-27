import java.util.Scanner;

/**
 * Simple calculator application that performs basic operations.
 */
public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Runs the calculator: prompts user for two numbers and an operator,
     * then calls the calculate method to perform the operation and prints the result.
     */
    public static void runCalculator() {

        System.out.println("Calculator is running!");

        double a = checkNumber("Enter the first number: ");
        double b = checkNumber("Enter the second number: ");

        System.out.print("Choose operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        double result = calculate(a, b, operator);

        System.out.println("Result: " + result);
    }

    /**
     * Checks if the user input is a valid number. If not, it prompts the user again until a valid number is entered.
     *
     * @param prompt The message to display when asking for input
     * @return The valid number
     */
    private static double checkNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
    }

    /**
     * Performs the calculation based on the given operator and numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @param operator The operator to use for the calculation
     * @return The result of the calculation
     */
    private static double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed!");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Unknown operator!");
                return 0;
        }
    }
}
