package Games_Applications.Multiple_Choice_Quiz;

public class Borderline_Impossible_Quiz {
    public static void Borderline_Impossible_Quiz() {
        // Question 1
        String question1 = "What is the approximate number of grains of sand on Earth?";
        String[] options1 = {"7.5 trillion", "7.5 quadrillion", "7.5 quintillion", "7.5 sextillion"};
        int correctAnswerIndex1 = 2;
        MultipleChoiceQuestionConstructor mcq1 = new MultipleChoiceQuestionConstructor(question1, options1, correctAnswerIndex1);

        mcq1.displayQuestion();
        mcq1.takeUserInput();

        // Question 2
        String question2 = "Who invented the first mechanical calculator in 1642?";
        String[] options2 = {"Blaise Pascal", "Gottfried Wilhelm Leibniz", "Charles Babbage", "Napier"};
        int correctAnswerIndex2 = 0;
        MultipleChoiceQuestionConstructor mcq2 = new MultipleChoiceQuestionConstructor(question2, options2, correctAnswerIndex2);

        mcq2.displayQuestion();
        mcq2.takeUserInput();

        // Question 3
        String question3 = "What is the chemical symbol for the element Molybdenum?";
        String[] options3 = {"Mo", "Mn", "Mb", "Mu"};
        int correctAnswerIndex3 = 0;
        MultipleChoiceQuestionConstructor mcq3 = new MultipleChoiceQuestionConstructor(question3, options3, correctAnswerIndex3);

        mcq3.displayQuestion();
        mcq3.takeUserInput();

        // Question 4
        String question4 = "What is the speed of light in a vacuum?";
        String[] options4 = {"299,792,458 meters per second", "300,000,000 meters per second", "299,792,245 meters per second", "299,792,458 kilometers per second"};
        int correctAnswerIndex4 = 0;
        MultipleChoiceQuestionConstructor mcq4 = new MultipleChoiceQuestionConstructor(question4, options4, correctAnswerIndex4);

        mcq4.displayQuestion();
        mcq4.takeUserInput();

        // Question 5
        String question5 = "Who is known as the 'Father of Geometry'?";
        String[] options5 = {"Euclid", "Pythagoras", "Archimedes", "Aristotle"};
        int correctAnswerIndex5 = 0;
        MultipleChoiceQuestionConstructor mcq5 = new MultipleChoiceQuestionConstructor(question5, options5, correctAnswerIndex5);

        mcq5.displayQuestion();
        mcq5.takeUserInput();

        // Question 6
        String question6 = "What is the boiling point of water at standard atmospheric pressure?";
        String[] options6 = {"100 degrees Celsius", "212 degrees Fahrenheit", "373 Kelvin", "All of the above"};
        int correctAnswerIndex6 = 3;
        MultipleChoiceQuestionConstructor mcq6 = new MultipleChoiceQuestionConstructor(question6, options6, correctAnswerIndex6);

        mcq6.displayQuestion();
        mcq6.takeUserInput();

        // Question 7
        String question7 = "Who discovered the first exoplanet orbiting a main-sequence star?";
        String[] options7 = {"Geoffrey Marcy and Paul Butler", "Michel Mayor and Didier Queloz", "Sara Seager", "William Borucki"};
        int correctAnswerIndex7 = 1;
        MultipleChoiceQuestionConstructor mcq7 = new MultipleChoiceQuestionConstructor(question7, options7, correctAnswerIndex7);

        mcq7.displayQuestion();
        mcq7.takeUserInput();

        // Question 8
        String question8 = "What is the longest venomous snake in the world?";
        String[] options8 = {"King Cobra", "Black Mamba", "Inland Taipan", "Eastern Brown Snake"};
        int correctAnswerIndex8 = 2;
        MultipleChoiceQuestionConstructor mcq8 = new MultipleChoiceQuestionConstructor(question8, options8, correctAnswerIndex8);

        mcq8.displayQuestion();
        mcq8.takeUserInput();

        // Question 9
        String question9 = "Which planet has the largest volcano in the solar system?";
        String[] options9 = {"Mars", "Earth", "Venus", "Jupiter"};
        int correctAnswerIndex9 = 0;
        MultipleChoiceQuestionConstructor mcq9 = new MultipleChoiceQuestionConstructor(question9, options9, correctAnswerIndex9);

        mcq9.displayQuestion();
        mcq9.takeUserInput();

        // Question 10
        String question10 = "What is the rarest naturally occurring element on Earth?";
        String[] options10 = {"Astatine", "Francium", "Promethium", "Technetium"};
        int correctAnswerIndex10 = 0;
        MultipleChoiceQuestionConstructor mcq10 = new MultipleChoiceQuestionConstructor(question10, options10, correctAnswerIndex10);

        mcq10.displayQuestion();
        mcq10.takeUserInput();

        System.out.println("Your score: " + (mcq1.getScore() + mcq2.getScore() + mcq3.getScore() + mcq4.getScore() + mcq5.getScore() +
                mcq6.getScore() + mcq7.getScore() + mcq8.getScore() + mcq9.getScore() + mcq10.getScore()));
    }
}
