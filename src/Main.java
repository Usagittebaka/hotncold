//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int randomNum = randomNumber();
        boolean guessedRight = false;

        for (int attempts = 1; attempts <= 10; attempts++) {
            System.out.println("Enter your number (attempt " + attempts + " of 10):");
            int num = number.nextInt();

            if (num == randomNum) {
                System.out.println("You guessed right!");
                guessedRight = true;
                break;
            } else {
                System.out.println("Better luck next time!");
            }
        }

        if (!guessedRight) {
            System.out.println("Sorry, you are out of attempts. The random number was: " + randomNum);
        }
    }

        public static int randomNumber() {
            Random random = new Random();
            return random.nextInt(100 + 1 - 1) + 1;
        }
    }