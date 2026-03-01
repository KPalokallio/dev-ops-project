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
            twoPlayer(scanner);
        } else {
            System.out.println("Invalid mode!");
        }
    }

    private static void singlePlayer(Scanner scanner, Random r) {
        System.out.print("Enter rock, paper, or scissors: ");
        String choice = scanner.nextLine().toLowerCase();
        String computerChoice = options[r.nextInt(options.length)];

        if (!isValid(choice)) {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Your choice: " + choice);
        System.out.println("Computer choice: " + computerChoice);

        String gameResult = result(choice, computerChoice);
        System.out.println(gameResult);
    }

    private static void twoPlayer(Scanner scanner) {
        System.out.print("Player 1, enter rock, paper, or scissors: ");
        String player1 = scanner.nextLine().toLowerCase();

        if (!isValid(player1)) {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.print("Player 2, enter rock, paper, or scissors: ");
        String player2 = scanner.nextLine().toLowerCase();

        if (!isValid(player2)) {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Player 1 choise: " + player1);
        System.out.println("Player 2 choise: " + player2);

        String gameResult = result(player1, player2);
        System.out.println(gameResult);
    }

    private static boolean isValid(String choice) {
        for (String option : options) {
            if (option.equals(choice)) return true;
        }
        return false;
    }

    private static String result(String user, String opponent) {
        if (user.equals(opponent)) {
            return "Draw";
        } else if ((user.equals("rock") && opponent.equals("scissors")) ||
                   (user.equals("paper") && opponent.equals("rock")) ||
                   (user.equals("scissors") && opponent.equals("paper"))) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }
}
