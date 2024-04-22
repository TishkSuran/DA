package Games_Applications.Multiple_Choice_Quiz;

import java.util.Scanner;

public class Difficult_Quiz {
    public static void Difficult_Quiz() {
        // Question 1
        String question1 = "Who was the first mathematician to develop the concept of zero?";
        String[] options1 = {"Pythagoras", "Euclid", "Aryabhata", "Archimedes"};
        int correctAnswerIndex1 = 2;
        MultipleChoiceQuestionConstructor mcq1 = new MultipleChoiceQuestionConstructor(question1, options1, correctAnswerIndex1);

        mcq1.displayQuestion();
        mcq1.takeUserInput();

        // Question 2
        String question2 = "What is the tallest species of penguin?";
        String[] options2 = {"Emperor Penguin", "King Penguin", "Gentoo Penguin", "Adélie Penguin"};
        int correctAnswerIndex2 = 1;
        MultipleChoiceQuestionConstructor mcq2 = new MultipleChoiceQuestionConstructor(question2, options2, correctAnswerIndex2);

        mcq2.displayQuestion();
        mcq2.takeUserInput();

        // Question 3
        String question3 = "Who wrote the classic Chinese text 'The Art of War'?";
        String[] options3 = {"Sun Tzu", "Confucius", "Laozi", "Mencius"};
        int correctAnswerIndex3 = 0;
        MultipleChoiceQuestionConstructor mcq3 = new MultipleChoiceQuestionConstructor(question3, options3, correctAnswerIndex3);

        mcq3.displayQuestion();
        mcq3.takeUserInput();

        // Question 4
        String question4 = "What is the chemical symbol for the element Tungsten?";
        String[] options4 = {"Tu", "Tn", "Tw", "W"};
        int correctAnswerIndex4 = 3;
        MultipleChoiceQuestionConstructor mcq4 = new MultipleChoiceQuestionConstructor(question4, options4, correctAnswerIndex4);

        mcq4.displayQuestion();
        mcq4.takeUserInput();

        // Question 5
        String question5 = "In what year did the Chernobyl nuclear disaster occur?";
        String[] options5 = {"1984", "1985", "1986", "1987"};
        int correctAnswerIndex5 = 2;
        MultipleChoiceQuestionConstructor mcq5 = new MultipleChoiceQuestionConstructor(question5, options5, correctAnswerIndex5);

        mcq5.displayQuestion();
        mcq5.takeUserInput();

        // Question 6
        String question6 = "Who was the first woman to fly solo across the Atlantic Ocean?";
        String[] options6 = {"Bessie Coleman", "Amelia Earhart", "Harriet Quimby", "Jacqueline Cochran"};
        int correctAnswerIndex6 = 1;
        MultipleChoiceQuestionConstructor mcq6 = new MultipleChoiceQuestionConstructor(question6, options6, correctAnswerIndex6);

        mcq6.displayQuestion();
        mcq6.takeUserInput();

        // Question 7
        String question7 = "Which country has the longest coastline?";
        String[] options7 = {"Canada", "Australia", "United States", "Russia"};
        int correctAnswerIndex7 = 0;
        MultipleChoiceQuestionConstructor mcq7 = new MultipleChoiceQuestionConstructor(question7, options7, correctAnswerIndex7);

        mcq7.displayQuestion();
        mcq7.takeUserInput();

        // Question 8
        String question8 = "What is the highest-grossing film of all time (unadjusted for inflation)?";
        String[] options8 = {"Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens"};
        int correctAnswerIndex8 = 1;
        MultipleChoiceQuestionConstructor mcq8 = new MultipleChoiceQuestionConstructor(question8, options8, correctAnswerIndex8);

        mcq8.displayQuestion();
        mcq8.takeUserInput();

        // Question 9
        String question9 = "Who is credited with inventing the World Wide Web?";
        String[] options9 = {"Bill Gates", "Tim Berners-Lee", "Steve Jobs", "Larry Page"};
        int correctAnswerIndex9 = 1;
        MultipleChoiceQuestionConstructor mcq9 = new MultipleChoiceQuestionConstructor(question9, options9, correctAnswerIndex9);

        mcq9.displayQuestion();
        mcq9.takeUserInput();

        // Question 10
        String question10 = "What is the most abundant gas in Earth's atmosphere?";
        String[] options10 = {"Nitrogen", "Oxygen", "Carbon Dioxide", "Argon"};
        int correctAnswerIndex10 = 0;
        MultipleChoiceQuestionConstructor mcq10 = new MultipleChoiceQuestionConstructor(question10, options10, correctAnswerIndex10);

        mcq10.displayQuestion();
        mcq10.takeUserInput();

        int score = mcq1.getScore() + mcq2.getScore() + mcq3.getScore() + mcq4.getScore() + mcq5.getScore() + mcq6.getScore() + mcq7.getScore() + mcq8.getScore() + mcq9.getScore() + mcq10.getScore();

        System.out.println("Your score: " + (score));

        Scanner scanner = new Scanner(System.in);
        if (score == 10) {
            System.out.println("Wow! You are one smart kid! You have now unlocked three bonus quizzes...");
            System.out.println();
            System.out.println("Would you like to play the bonus...");
            System.out.println("1. Extremely Difficult Quiz (1)");
            System.out.println("2. The Hardest Quiz Ever (2)");
            System.out.println("3. Borderline Impossible Quiz (3)");
            System.out.println();

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


                    if (userInput == 1) {
                        System.out.println("You have selected the Extremely Difficult Quiz!");
                        Extremely_Difficult_Quiz extremelyDifficultQuiz = new Extremely_Difficult_Quiz();
                        extremelyDifficultQuiz.Extremely_Difficult_Quiz();
                        break;

                    } else if (userInput == 2) {
                        System.out.println("You have selected the Hardest Quiz Ever!");
                        Hardest_Quiz_Ever hardestQuizEver = new Hardest_Quiz_Ever();
                        hardestQuizEver.Hardest_Quiz_Ever();
                        break;

                    } else if (userInput == 3) {
                        System.out.println("You have selected the Borderline Impossible Quiz!");
                        Borderline_Impossible_Quiz borderlineImpossibleQuiz = new Borderline_Impossible_Quiz();
                        borderlineImpossibleQuiz.Borderline_Impossible_Quiz();
                        break;
                    } else if (userInput == 4) {
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter 1, 2, 3 or 4.");
                    }
                }
            }
        }
    }





}
