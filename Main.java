import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome!");
            System.out.println("\nWhat would you like to use?");
            System.out.println("1. Calculator");
            System.out.println("2. Rock-Paper-Scissors game");
            System.out.println("0. Exit");
            System.out.print("\nEnter the number of your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Calculator.runCalculator(scanner);
                    break;
                case "2":
                    RockPaperScissors.runGame(scanner);
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
