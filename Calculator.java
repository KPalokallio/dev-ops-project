import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public void runCalculator() {
        System.out.println("Laskin on käynnissä!");

        System.out.print("Anna ensimmäinen luku: ");
        double a = scanner.nextDouble();

        System.out.print("Anna toinen luku: ");
        double b = scanner.nextDouble();
    }

    private double calculate(double num1, double num2, String operator) {

    }
}