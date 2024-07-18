import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizApplication {
    private static final int TIME_PER_QUESTION = 10;  // Adjust time in seconds

    public static void main(String[] args) throws InterruptedException {
        String[] questions = { 
            "What is the capital of India?", 
            "What is the chemical formula of sodium?"
        };
        String[][] options = {
            {"Delhi", "Gwalior", "Agra"},
            {"S", "N", "Na"}
        };
        char[] answers = {'A', 'C'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            score += takeQuiz(questions[i], options[i], answers[i]);
        }
        displayResult(score, questions.length);
    }

    public static int takeQuiz(String question, String[] options, char answer) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char) (i + 65) + ". " + options[i]);
        }
        System.out.println("Enter your answer (A - D):");

        // Time functionality
        long startTime = System.currentTimeMillis();
        String userAnswer = "";
        
        while (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - startTime) < TIME_PER_QUESTION) {
            if (sc.hasNextLine()) {
                userAnswer = sc.nextLine().toUpperCase();
                break;
            }
            Thread.sleep(100); // Check the answer every 100 milliseconds
        }

        if (userAnswer.isEmpty() || userAnswer.charAt(0) != answer) {
            System.out.println("Time is up or answer is incorrect: the correct answer is: " + answer);
            return 0;
        } else {
            System.out.println("Answer is correct!");
            return 1;
        }
    }

    public static void displayResult(int score, int totalQuestions) {
        System.out.println("Displaying the result:");
        System.out.println("Final score is: " + score + "/" + totalQuestions);
    }
}
