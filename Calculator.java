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
        double a = checkNumber("Anna ensimmäinen luku: ");
        double b = checkNumber("Anna toinen luku: ");

        System.out.print("Valitse operaattori (+, -, *, /): ");
        String operator = scanner.next();

        double result = calculate(a, b, operator);

        System.out.println("Tulos: " + result);
    }

    private double checkNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Syöte ei voi olla tyhjä!");
                continue;
            }

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte! Anna numero.");
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