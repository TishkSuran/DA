package Games_Applications.Multiple_Choice_Quiz;

import java.util.Scanner;

public class General_Knowledge_Quiz {
    public static void General_Knowledge_Quiz_Run() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║ Hello, and welcome to the General Knowledge Quiz!  ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.println();


        System.out.println("Would you like to play the...");
        System.out.println("1. Easy Quiz (1)");
        System.out.println("2. Intermediate Quiz (2)");
        System.out.println("3. Difficult Quiz (3)");
        System.out.println("4. To exit the Quiz (4)");
        System.out.println();
        System.out.println("All quizzes are 10 questions long and are multiple choice!");

        while (true) {
            int userInput = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    userInput = scanner.nextInt();
                    if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter 1, 2, 3 or 4.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }

            if (userInput == 1) {
                System.out.println("You have selected the easy quiz!");
                Easy_Quiz easyQuiz = new Easy_Quiz();
                easyQuiz.Easy_Quiz();
                break;
            } else if (userInput == 2) {
                System.out.println("You have selected the intermediate quiz!");
                Intermediate_Quiz intermediateQuiz = new Intermediate_Quiz();
                intermediateQuiz.Intermediate_Quiz();
                break;
            } else if (userInput == 3) {
                System.out.println("You have selected the difficult quiz!");
                Difficult_Quiz difficultQuiz = new Difficult_Quiz();
                difficultQuiz.Difficult_Quiz();
                break;
            } else if (userInput == 4) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 1, 2, 3 or 4.");
            }
        }
    }
}