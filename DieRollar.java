import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {

        // Initialize variables, scanner, and random
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int sum = 0;
        int rollCount = 0;
        boolean programDone = false;
        String playAgain = "";

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        do {
            // Reset roll count for each new game
            rollCount = 0;

            // Table Header
            System.out.printf("\nRoll\tDie1\tDie2\tDie3\tSum");
            System.out.println();
            System.out.println("----------------------------------------------------------");

            // Loop until a triple is thrown
            do {
                rollCount++;
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;
                sum = die1 + die2 + die3;

                // Print row formatted into aligned columns
                System.out.printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%d", rollCount, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println();

            // Prompt user to play again
            System.out.print("Do you want to play again? (Y or N): ");
            if (in.hasNextLine()) {
                playAgain = in.nextLine();
            }

            if (!playAgain.equalsIgnoreCase("Y")) {
                programDone = true;
            }

        } while (!programDone);
    }
}