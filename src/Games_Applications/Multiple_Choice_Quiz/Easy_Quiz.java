package Games_Applications.Multiple_Choice_Quiz;

public class Easy_Quiz {
    public static void Easy_Quiz() {
        // Question 1
        String question1 = "What is the capital of France?";
        String[] options1 = {"Paris", "London", "Berlin", "Rome"};
        int correctAnswerIndex1 = 0;
        MultipleChoiceQuestionConstructor mcq1 = new MultipleChoiceQuestionConstructor(question1, options1, correctAnswerIndex1);

        mcq1.displayQuestion();
        mcq1.takeUserInput();

        // Question 2
        String question2 = "What is the largest ocean in the world?";
        String[] options2 = {"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"};
        int correctAnswerIndex2 = 3;
        MultipleChoiceQuestionConstructor mcq2 = new MultipleChoiceQuestionConstructor(question2, options2, correctAnswerIndex2);

        mcq2.displayQuestion();
        mcq2.takeUserInput();

        // Question 3
        String question3 = "Where was the first example of paper money used?";
        String[] options3 = {"Turkey", "Iraq", "Greece", "China"};
        int correctAnswerIndex3 = 3;
        MultipleChoiceQuestionConstructor mcq3 = new MultipleChoiceQuestionConstructor(question3, options3, correctAnswerIndex3);

        mcq3.displayQuestion();
        mcq3.takeUserInput();

        // Question 4
        String question4 = "What number was the Apollo mission that successfully put a man on the moon for the first time in human history? ";
        String[] options4 = {"Apollo 11", "Apollo 12", "Apollo 13", "Apollo 14"};
        int correctAnswerIndex4 = 0;
        MultipleChoiceQuestionConstructor mcq4 = new MultipleChoiceQuestionConstructor(question4, options4, correctAnswerIndex4);

        mcq4.displayQuestion();
        mcq4.takeUserInput();

        // Question 5
        String question5 = "Which of the following languages has the longest alphabet? ";
        String[] options5 = {"English", "Greek", "Russian", "Arabic"};
        int correctAnswerIndex5 = 2;
        MultipleChoiceQuestionConstructor mcq5 = new MultipleChoiceQuestionConstructor(question5, options5, correctAnswerIndex5);

        mcq5.displayQuestion();
        mcq5.takeUserInput();

        // Question 6
        String question6 = "Which planet is known as the Red Planet?";
        String[] options6 = {"Venus", "Jupiter", "Mars", "Saturn"};
        int correctAnswerIndex6 = 2;
        MultipleChoiceQuestionConstructor mcq6 = new MultipleChoiceQuestionConstructor(question6, options6, correctAnswerIndex6);

        mcq6.displayQuestion();
        mcq6.takeUserInput();

        // Question 7
        String question7 = "What is the chemical symbol for water?";
        String[] options7 = {"H2O", "CO2", "NaCl", "NH3"};
        int correctAnswerIndex7 = 0;
        MultipleChoiceQuestionConstructor mcq7 = new MultipleChoiceQuestionConstructor(question7, options7, correctAnswerIndex7);

        mcq7.displayQuestion();
        mcq7.takeUserInput();

        // Question 8
        String question8 = "Which is the largest mammal?";
        String[] options8 = {"Elephant", "Blue Whale", "Giraffe", "Hippopotamus"};
        int correctAnswerIndex8 = 1;
        MultipleChoiceQuestionConstructor mcq8 = new MultipleChoiceQuestionConstructor(question8, options8, correctAnswerIndex8);

        mcq8.displayQuestion();
        mcq8.takeUserInput();

        // Question 9
        String question9 = "What is the tallest mountain in the world?";
        String[] options9 = {"K2", "Kangchenjunga", "Mount Everest", "Lhotse"};
        int correctAnswerIndex9 = 2;
        MultipleChoiceQuestionConstructor mcq9 = new MultipleChoiceQuestionConstructor(question9, options9, correctAnswerIndex9);

        mcq9.displayQuestion();
        mcq9.takeUserInput();

        // Question 10
        String question10 = "What is the largest organ in the human body?";
        String[] options10 = {"Liver", "Heart", "Skin", "Brain"};
        int correctAnswerIndex10 = 2;
        MultipleChoiceQuestionConstructor mcq10 = new MultipleChoiceQuestionConstructor(question10, options10, correctAnswerIndex10);

        mcq10.displayQuestion();
        mcq10.takeUserInput();

        System.out.println("Your score: " + (mcq1.getScore() + mcq2.getScore() + mcq3.getScore() + mcq4.getScore() + mcq5.getScore() +
                mcq6.getScore() + mcq7.getScore() + mcq8.getScore() + mcq9.getScore() + mcq10.getScore()));
    }
}

