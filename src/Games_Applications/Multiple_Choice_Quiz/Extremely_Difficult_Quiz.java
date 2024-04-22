package Games_Applications.Multiple_Choice_Quiz;

public class Extremely_Difficult_Quiz {
    public static void Extremely_Difficult_Quiz() {
        // Question 1
        String question1 = "Who discovered the double helix structure of DNA?";
        String[] options1 = {"James Watson and Francis Crick", "Rosalind Franklin", "Linus Pauling", "Gregor Mendel"};
        int correctAnswerIndex1 = 0;
        MultipleChoiceQuestionConstructor mcq1 = new MultipleChoiceQuestionConstructor(question1, options1, correctAnswerIndex1);

        mcq1.displayQuestion();
        mcq1.takeUserInput();

        // Question 2
        String question2 = "Which chemical element has the highest melting point?";
        String[] options2 = {"Tungsten", "Carbon", "Platinum", "Osmium"};
        int correctAnswerIndex2 = 0;
        MultipleChoiceQuestionConstructor mcq2 = new MultipleChoiceQuestionConstructor(question2, options2, correctAnswerIndex2);

        mcq2.displayQuestion();
        mcq2.takeUserInput();

        // Question 3
        String question3 = "What is the rarest blood type?";
        String[] options3 = {"A+", "AB+", "AB-", "O-"};
        int correctAnswerIndex3 = 2;
        MultipleChoiceQuestionConstructor mcq3 = new MultipleChoiceQuestionConstructor(question3, options3, correctAnswerIndex3);

        mcq3.displayQuestion();
        mcq3.takeUserInput();

        // Question 4
        String question4 = "Which of the following equations represents the Heisenberg Uncertainty Principle?";
        String[] options4 = {"ΔpΔx ≥ h/4π", "E = mc^2", "F = ma", "PV = nRT"};
        int correctAnswerIndex4 = 0;
        MultipleChoiceQuestionConstructor mcq4 = new MultipleChoiceQuestionConstructor(question4, options4, correctAnswerIndex4);

        mcq4.displayQuestion();
        mcq4.takeUserInput();

        // Question 5
        String question5 = "What is the largest prime number known to date?";
        String[] options5 = {"2^82589933 − 1", "2^57885161 − 1", "2^43112609 − 1", "2^37156667 − 1"};
        int correctAnswerIndex5 = 0;
        MultipleChoiceQuestionConstructor mcq5 = new MultipleChoiceQuestionConstructor(question5, options5, correctAnswerIndex5);

        mcq5.displayQuestion();
        mcq5.takeUserInput();

        // Question 6
        String question6 = "Which philosopher is known for the concept of 'Tabula Rasa'?";
        String[] options6 = {"Plato", "Aristotle", "John Locke", "Immanuel Kant"};
        int correctAnswerIndex6 = 2;
        MultipleChoiceQuestionConstructor mcq6 = new MultipleChoiceQuestionConstructor(question6, options6, correctAnswerIndex6);

        mcq6.displayQuestion();
        mcq6.takeUserInput();

        // Question 7
        String question7 = "Who was the first person to reach the South Pole?";
        String[] options7 = {"Robert Falcon Scott", "Roald Amundsen", "Ernest Shackleton", "Edmund Hillary"};
        int correctAnswerIndex7 = 1;
        MultipleChoiceQuestionConstructor mcq7 = new MultipleChoiceQuestionConstructor(question7, options7, correctAnswerIndex7);

        mcq7.displayQuestion();
        mcq7.takeUserInput();

        // Question 8
        String question8 = "What is the largest known prime factor of any composite number?";
        String[] options8 = {"Mersenne Prime", "Fermat Prime", "Euler Prime", "Wilson Prime"};
        int correctAnswerIndex8 = 0;
        MultipleChoiceQuestionConstructor mcq8 = new MultipleChoiceQuestionConstructor(question8, options8, correctAnswerIndex8);

        mcq8.displayQuestion();
        mcq8.takeUserInput();

        // Question 9
        String question9 = "Who discovered the first antibiotic substance?";
        String[] options9 = {"Alexander Fleming", "Louis Pasteur", "Robert Koch", "Joseph Lister"};
        int correctAnswerIndex9 = 0;
        MultipleChoiceQuestionConstructor mcq9 = new MultipleChoiceQuestionConstructor(question9, options9, correctAnswerIndex9);

        mcq9.displayQuestion();
        mcq9.takeUserInput();

        // Question 10
        String question10 = "What is the capital of Bhutan?";
        String[] options10 = {"Thimphu", "Kathmandu", "Dhaka", "Colombo"};
        int correctAnswerIndex10 = 0;
        MultipleChoiceQuestionConstructor mcq10 = new MultipleChoiceQuestionConstructor(question10, options10, correctAnswerIndex10);

        mcq10.displayQuestion();
        mcq10.takeUserInput();

        System.out.println("Your score: " + (mcq1.getScore() + mcq2.getScore() + mcq3.getScore() + mcq4.getScore() + mcq5.getScore() +
                mcq6.getScore() + mcq7.getScore() + mcq8.getScore() + mcq9.getScore() + mcq10.getScore()));
    }
}
