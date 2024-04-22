package Games_Applications.Multiple_Choice_Quiz;

public class Hardest_Quiz_Ever {
    public static void Hardest_Quiz_Ever() {
        // Question 1
        String question1 = "What is the name of the brightest star in the night sky?";
        String[] options1 = {"Sirius", "Alpha Centauri", "Betelgeuse", "Vega"};
        int correctAnswerIndex1 = 0;
        MultipleChoiceQuestionConstructor mcq1 = new MultipleChoiceQuestionConstructor(question1, options1, correctAnswerIndex1);

        mcq1.displayQuestion();
        mcq1.takeUserInput();

        // Question 2
        String question2 = "Who wrote the play 'Waiting for Godot'?";
        String[] options2 = {"Samuel Beckett", "Albert Camus", "Jean-Paul Sartre", "Eugene O'Neill"};
        int correctAnswerIndex2 = 0;
        MultipleChoiceQuestionConstructor mcq2 = new MultipleChoiceQuestionConstructor(question2, options2, correctAnswerIndex2);

        mcq2.displayQuestion();
        mcq2.takeUserInput();

        // Question 3
        String question3 = "What is the chemical symbol for the element Tantalum?";
        String[] options3 = {"Ta", "Tl", "Tm", "Tb"};
        int correctAnswerIndex3 = 0;
        MultipleChoiceQuestionConstructor mcq3 = new MultipleChoiceQuestionConstructor(question3, options3, correctAnswerIndex3);

        mcq3.displayQuestion();
        mcq3.takeUserInput();

        // Question 4
        String question4 = "Which planet in our solar system has the most moons?";
        String[] options4 = {"Jupiter", "Saturn", "Uranus", "Neptune"};
        int correctAnswerIndex4 = 0;
        MultipleChoiceQuestionConstructor mcq4 = new MultipleChoiceQuestionConstructor(question4, options4, correctAnswerIndex4);

        mcq4.displayQuestion();
        mcq4.takeUserInput();

        // Question 5
        String question5 = "Who composed the 'Four Seasons' concertos?";
        String[] options5 = {"Johann Sebastian Bach", "Ludwig van Beethoven", "Antonio Vivaldi", "Wolfgang Amadeus Mozart"};
        int correctAnswerIndex5 = 2;
        MultipleChoiceQuestionConstructor mcq5 = new MultipleChoiceQuestionConstructor(question5, options5, correctAnswerIndex5);

        mcq5.displayQuestion();
        mcq5.takeUserInput();

        // Question 6
        String question6 = "Which chemical element has the lowest boiling point?";
        String[] options6 = {"Helium", "Hydrogen", "Neon", "Nitrogen"};
        int correctAnswerIndex6 = 0;
        MultipleChoiceQuestionConstructor mcq6 = new MultipleChoiceQuestionConstructor(question6, options6, correctAnswerIndex6);

        mcq6.displayQuestion();
        mcq6.takeUserInput();

        // Question 7
        String question7 = "Who is considered the father of modern philosophy?";
        String[] options7 = {"Aristotle", "Plato", "Socrates", "René Descartes"};
        int correctAnswerIndex7 = 3;
        MultipleChoiceQuestionConstructor mcq7 = new MultipleChoiceQuestionConstructor(question7, options7, correctAnswerIndex7);

        mcq7.displayQuestion();
        mcq7.takeUserInput();

        // Question 8
        String question8 = "What is the capital city of Mongolia?";
        String[] options8 = {"Ulaanbaatar", "Kathmandu", "Astana", "Tashkent"};
        int correctAnswerIndex8 = 0;
        MultipleChoiceQuestionConstructor mcq8 = new MultipleChoiceQuestionConstructor(question8, options8, correctAnswerIndex8);

        mcq8.displayQuestion();
        mcq8.takeUserInput();

        // Question 9
        String question9 = "What is the largest freshwater lake by volume in the world?";
        String[] options9 = {"Lake Baikal", "Lake Superior", "Lake Michigan", "Lake Victoria"};
        int correctAnswerIndex9 = 0;
        MultipleChoiceQuestionConstructor mcq9 = new MultipleChoiceQuestionConstructor(question9, options9, correctAnswerIndex9);

        mcq9.displayQuestion();
        mcq9.takeUserInput();

        // Question 10
        String question10 = "Who is credited with the discovery of penicillin?";
        String[] options10 = {"Alexander Fleming", "Louis Pasteur", "Robert Koch", "Joseph Lister"};
        int correctAnswerIndex10 = 0;
        MultipleChoiceQuestionConstructor mcq10 = new MultipleChoiceQuestionConstructor(question10, options10, correctAnswerIndex10);

        mcq10.displayQuestion();
        mcq10.takeUserInput();

        System.out.println("Your score: " + (mcq1.getScore() + mcq2.getScore() + mcq3.getScore() + mcq4.getScore() + mcq5.getScore() +
                mcq6.getScore() + mcq7.getScore() + mcq8.getScore() + mcq9.getScore() + mcq10.getScore()));
    }
}
