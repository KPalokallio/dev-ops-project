import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String[] options = {"rock", "paper", "scissors"};

    public static void runGame(Scanner scanner) {
        System.out.println("\nWelcome to Rock-Paper-Scissors Game!");
        Random r = new Random();

        System.out.print("Singleplayer (1) or two-players (2)? Enter 1 or 2: ");
        String mode = scanner.nextLine();

        if (mode.equals("1")) {
            singlePlayer(scanner, r);
        } else if (mode.equals("2")) {

        } else {
            System.out.println("Invalid mode!");
        }
    }

    private static void singlePlayer(Scanner scanner, Random r) {
        System.out.print("Enter rock, paper, or scissors: ");
        String choice = scanner.nextLine().toLowerCase();
        System.out.println("You chose: " + choice);
    }

    private static boolean isValid(String choice) {
        for (String option : options) {
            if (option.equals(choice)) return true;
        }
        return false;
    }

}


