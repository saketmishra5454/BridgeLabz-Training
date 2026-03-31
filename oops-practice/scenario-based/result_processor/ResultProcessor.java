package result_processor;

import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

// Quiz Result Processor class
class QuizProcessor {

    // method to calculate score
    public static int calculateScore(String[] correctAnswers,
                                     String[] userAnswers)
            throws InvalidQuizSubmissionException {

        // validation: length mismatch
        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException(
                    "Number of answers does not match the quiz questions");
        }

        int score = 0;

        // comparing answers
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }

        return score;
    }

    // method to return grade based on score
    public static String getGrade(int score, int totalQuestions) {

        double percentage = (score * 100.0) / totalQuestions;

        if (percentage >= 80)
            return "A";
        else if (percentage >= 60)
            return "B";
        else if (percentage >= 40)
            return "C";
        else
            return "D";
    }
}

// Main class
public class ResultProcessor {

    public static void main(String[] args) {

        // correct answers
        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        // user answers
        String[] user1Answers = {"A", "B", "C", "D", "A"};
        String[] user2Answers = {"A", "C", "C", "D", "B"};

        // list to store scores of multiple users
        List<Integer> scores = new ArrayList<>();

        try {
            int score1 = QuizProcessor.calculateScore(
                    correctAnswers, user1Answers);
            scores.add(score1);

            int score2 = QuizProcessor.calculateScore(
                    correctAnswers, user2Answers);
            scores.add(score2);

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // displaying results
        int userNo = 1;
        for (int score : scores) {
            System.out.println("User " + userNo + " Score: " + score);
            System.out.println("Grade: " +
                    QuizProcessor.getGrade(score, correctAnswers.length));
            System.out.println();
            userNo++;
        }
    }
}
