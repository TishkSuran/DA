package Games_Applications;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    int[] lottery = new int[6];
    int[] lotteryNumbers = {5, 2, 43, 24, 25, 3};

    public void playLottery() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Great! Please choose 6 unique numbers between 1 and 50 or let us generate random numbers:");
        System.out.println("Enter '1' to choose your numbers manually or '2' for random numbers:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter 6 unique numbers between 1 and 50:");
            for (int i = 0; i < 6; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int userNumber = getUserNumber(scanner, lottery);
                lottery[i] = userNumber;
            }
        } else if (choice == 2) {
            System.out.println("Generating random numbers...");
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                int randomNumber;
                do {
                    randomNumber = random.nextInt(50) + 1;
                } while (containsNumber(lottery, randomNumber));
                lottery[i] = randomNumber;
            }
            System.out.println("Random numbers generated: " + Arrays.toString(lottery));
        }

        int matchedNumbers = countMatchedNumbers(lottery, lotteryNumbers);
        System.out.println("You matched " + matchedNumbers + " numbers with the winning lottery numbers.");

        if (matchedNumbers == 6) {
            System.out.println("Congratulations! You won the Java lottery!");
        } else {
            System.out.println("Unfortunately, you didn't win this time. Better luck next time!");
        }
    }

    private int getUserNumber(Scanner scanner, int[] lottery) {
        int number = scanner.nextInt();
        while (number < 1 || number > 50 || containsNumber(lottery, number)) {
            System.out.println("Invalid number. Please enter a unique number between 1 and 50:");
            number = scanner.nextInt();
        }
        return number;
    }

    private boolean containsNumber(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    private int countMatchedNumbers(int[] array1, int[] array2) {
        int count = 0;
        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
