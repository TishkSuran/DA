package Games_Applications.Multiple_Choice_Quiz;

import java.util.Scanner;

public class MultipleChoiceQuestionConstructor {
    private String question;
    private String[] options;
    private int correctAnswerIndex;
    private int score;

    public MultipleChoiceQuestionConstructor(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int correctAnswerIndex) {
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean checkAnswer(int answerIndex) {
        boolean correct = answerIndex == correctAnswerIndex;
        if (correct) {
            score++;
        }
        return correct;
    }

    public void displayQuestion() {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        //System.out.println();
    }

    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your answer (1-" + options.length + "): ");
        int userAnswer = scanner.nextInt();
        if (userAnswer >= 1 && userAnswer <= options.length) {
            boolean correct = checkAnswer(userAnswer - 1);
            if (correct) {
                System.out.println("Correct!");
                System.out.println();
            } else {
                System.out.println("Incorrect. The correct answer is: " + options[correctAnswerIndex]);
                System.out.println();
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and " + options.length);
        }
    }

    public int getScore() {
        return score;
    }
}
