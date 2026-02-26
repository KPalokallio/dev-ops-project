import java.util.Scanner;

/**
 * Simple calculator application that performs basic operations.
 */

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Runs the calculator: prompts user for two numbers and an operator,
     * then calls the calculate method to perform the operation and prints the result.
     */

    public void runCalculator() {
        System.out.println("Laskin on käynnissä!");

        System.out.print("Anna ensimmäinen luku: ");
        double a = scanner.nextDouble();

        System.out.print("Anna toinen luku: ");
        double b = scanner.nextDouble();

        System.out.print("Valitse operaattori (+, -, *, /): ");
        String operator = scanner.next();

        double result = calculate(a, b, operator);

        System.out.println("Tulos: " + result);
    }

    /**
     * Performs the calculation based on the given operator and numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @param operator The operator to use for the calculation
     * @return The result of the calculation
     */

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("Nollalla ei voi jakaa!");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Tuntematon operaattori!");
                return 0;
    }
}