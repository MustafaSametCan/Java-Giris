import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int guess, chance;
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int num = random.nextInt(100);
        System.out.println("How many chances do you want:");
        chance = scan.nextInt();
        boolean statue = false;

        for (int i = 1; i <= chance; i++) {
            int wrongguess = i - 1;
            System.out.println("Your guess:");
            guess = scan.nextInt();
            if (guess < 0 || guess > 100) {
                System.out.println("Please enter a number between 0 and 100");
                continue;
            }
            if (guess == num) {
                System.out.println("Correct!!");
                break;
            } else if (guess < num) {
                System.out.println("Bigger!!");
            } else {
                System.out.println("Smaller!!");
            }
            if (i == chance) {
                System.out.println("You're out of chances finding the right number");
                System.out.println("Correct number was:" + num);
            }


        }
    }
}
