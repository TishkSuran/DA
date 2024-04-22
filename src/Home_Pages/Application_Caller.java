package Home_Pages;

import Games_Applications.Lottery;
import Games_Applications.Multiple_Choice_Quiz.General_Knowledge_Quiz;
import Productivity_Applications.Revision_Tracker;
import Religious_Applications.Hadith_Generator;
import Religious_Applications.Zakat_Calculator;

import java.util.Scanner;

public class Application_Caller {
    public Application_Caller() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.println();
            System.out.println("Which section of the All-in-One Hub would you like to access?");
            System.out.println("1. Productivity");
            System.out.println("2. Games");
            System.out.println("3. Religion / Spirituality");
            System.out.println("4. To Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Day Revision Tracker");
                    System.out.println("2. User to Do List");
                    System.out.println("3. Note-taking App");
                    System.out.println("4. Back to Main Menu");
                    int productivityChoice = scanner.nextInt();
                    if (productivityChoice == 1) {
                        Revision_Tracker revisionTracker = new Revision_Tracker();
                        revisionTracker.inputStudyDetails();
                        revisionTracker.displayStudyDetails();
                    } else if (productivityChoice == 4) {
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 2:
                    System.out.println("1. Tic Tac Toe");
                    System.out.println("2. Mock Lottery");
                    System.out.println("3. Trivia Quiz");
                    int gameChoice = scanner.nextInt();
                    if (gameChoice == 1) {
                        // Implement Tic Tac Toe
                    } else if (gameChoice == 2) {
                        Lottery lottery = new Lottery();
                        lottery.playLottery();
                    } else if (gameChoice == 3) {
                        General_Knowledge_Quiz generalKnowledgeQuiz = new General_Knowledge_Quiz();
                        General_Knowledge_Quiz.General_Knowledge_Quiz_Run();
                    }else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 3:
                    System.out.println("1. Random Hadith Generator");
                    System.out.println("2. Zakat Calculator");;
                    int spiritualChoice = scanner.nextInt();
                    if(spiritualChoice == 1) {
                        while (true) {
                            Hadith_Generator.readHadith();
                            System.out.println("Press 'H' to view another Hadith.");
                            System.out.println("Press any other key to exit.");
                            Scanner scanner2 = new Scanner(System.in);
                            String userInput = scanner2.nextLine();
                            if (userInput.equalsIgnoreCase("h")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                    } else if (spiritualChoice == 2) {
                        Zakat_Calculator zakatCalculator = new Zakat_Calculator();
                    }

                    break;
                case 4:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (repeat);

        System.out.println("Thank you for using the All-in-One Hub. Goodbye!");
    }
}
