import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoryGame {

    private static String[][] board = new String[4][4];
    private static boolean[][] revealed = new boolean[4][4];

    public static void runMG(Scanner scanner) {
        int found = 0;
        int Pairs = 8;

        while (found < Pairs) {

        }

    }

    private static void fillBoard() {
        List<String> cards = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            cards.add(String.valueOf(i));
            cards.add(String.valueOf(i));
        }

    }

}
