package Games_Applications.Multiple_Choice_Quiz;

public class Intermediate_Quiz {
    public static void Intermediate_Quiz() {
        // Question 1
        String question1 = "Who is the author of 'War and Peace'?";
        String[] options1 = {"Leo Tolstoy", "Fyodor Dostoevsky", "Anton Chekhov", "Nikolai Gogol"};
        int correctAnswerIndex1 = 0;
        MultipleChoiceQuestionConstructor mcq1 = new MultipleChoiceQuestionConstructor(question1, options1, correctAnswerIndex1);

        mcq1.displayQuestion();
        mcq1.takeUserInput();

        // Question 2
        String question2 = "What is the capital city of Australia?";
        String[] options2 = {"Sydney", "Melbourne", "Canberra", "Brisbane"};
        int correctAnswerIndex2 = 2;
        MultipleChoiceQuestionConstructor mcq2 = new MultipleChoiceQuestionConstructor(question2, options2, correctAnswerIndex2);

        mcq2.displayQuestion();
        mcq2.takeUserInput();

        // Question 3
        String question3 = "Who was the first woman to win a Nobel Prize?";
        String[] options3 = {"Marie Curie", "Rosa Parks", "Mother Teresa", "Indira Gandhi"};
        int correctAnswerIndex3 = 0;
        MultipleChoiceQuestionConstructor mcq3 = new MultipleChoiceQuestionConstructor(question3, options3, correctAnswerIndex3);

        mcq3.displayQuestion();
        mcq3.takeUserInput();

        // Question 4
        String question4 = "Which famous scientist wrote the book 'A Brief History of Time'?";
        String[] options4 = {"Albert Einstein", "Stephen Hawking", "Isaac Newton", "Galileo Galilei"};
        int correctAnswerIndex4 = 1;
        MultipleChoiceQuestionConstructor mcq4 = new MultipleChoiceQuestionConstructor(question4, options4, correctAnswerIndex4);

        mcq4.displayQuestion();
        mcq4.takeUserInput();

        // Question 5
        String question5 = "Which country is the largest by land area?";
        String[] options5 = {"Russia", "Canada", "China", "United States"};
        int correctAnswerIndex5 = 0;
        MultipleChoiceQuestionConstructor mcq5 = new MultipleChoiceQuestionConstructor(question5, options5, correctAnswerIndex5);

        mcq5.displayQuestion();
        mcq5.takeUserInput();

        // Question 6
        String question6 = "What is the chemical symbol for the element Mercury?";
        String[] options6 = {"Me", "Hg", "M", "Mc"};
        int correctAnswerIndex6 = 1;
        MultipleChoiceQuestionConstructor mcq6 = new MultipleChoiceQuestionConstructor(question6, options6, correctAnswerIndex6);

        mcq6.displayQuestion();
        mcq6.takeUserInput();

        // Question 7
        String question7 = "Who composed the famous classical piece 'Symphony No. 9 in D minor, Op. 125', also known as the 'Choral Symphony'?";
        String[] options7 = {"Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Franz Schubert"};
        int correctAnswerIndex7 = 1;
        MultipleChoiceQuestionConstructor mcq7 = new MultipleChoiceQuestionConstructor(question7, options7, correctAnswerIndex7);

        mcq7.displayQuestion();
        mcq7.takeUserInput();

        // Question 8
        String question8 = "In which year did the Titanic sink?";
        String[] options8 = {"1912", "1915", "1918", "1920"};
        int correctAnswerIndex8 = 0;
        MultipleChoiceQuestionConstructor mcq8 = new MultipleChoiceQuestionConstructor(question8, options8, correctAnswerIndex8);

        mcq8.displayQuestion();
        mcq8.takeUserInput();

        // Question 9
        String question9 = "Who is known as the 'Father of Geometry'?";
        String[] options9 = {"Euclid", "Pythagoras", "Archimedes", "Aristotle"};
        int correctAnswerIndex9 = 0;
        MultipleChoiceQuestionConstructor mcq9 = new MultipleChoiceQuestionConstructor(question9, options9, correctAnswerIndex9);

        mcq9.displayQuestion();
        mcq9.takeUserInput();

        // Question 10
        String question10 = "Which famous artist painted 'The Persistence of Memory', featuring melting clocks?";
        String[] options10 = {"Vincent van Gogh", "Pablo Picasso", "Salvador Dalí", "Claude Monet"};
        int correctAnswerIndex10 = 2;
        MultipleChoiceQuestionConstructor mcq10 = new MultipleChoiceQuestionConstructor(question10, options10, correctAnswerIndex10);

        mcq10.displayQuestion();
        mcq10.takeUserInput();

        System.out.println("Your score: " + (mcq1.getScore() + mcq2.getScore() + mcq3.getScore() + mcq4.getScore() + mcq5.getScore() +
                mcq6.getScore() + mcq7.getScore() + mcq8.getScore() + mcq9.getScore() + mcq10.getScore()));
    }
}
