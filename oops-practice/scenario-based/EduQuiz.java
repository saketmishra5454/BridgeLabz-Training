public class EduQuiz {

    // correct answers of quiz
    static String[] correctAnswers = {
        "A", "B", "C", "D", "A",
        "C", "B", "D", "A", "C"
    };

    // answers given by student
    static String[] studentAnswers = {
        "a", "b", "d", "D", "A",
        "c", "b", "a", "A", "c"
    };

    // method to calculate score
    static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            // checking answers ignoring case
            if (correct[i].equalsIgnoreCase(student[i])) {
                score++;
            }
        }
        return score;
    }

    // method to show feedback for each question
    static void showFeedback(String[] correct, String[] student) {

        System.out.println("Quiz Feedback:");
        for (int i = 0; i < correct.length; i++) {

            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void main(String[] args) {

        int totalQuestions = correctAnswers.length;

        // showing result for each question
        showFeedback(correctAnswers, studentAnswers);

        // calculating total score
        int score = calculateScore(correctAnswers, studentAnswers);

        // calculating percentage
        double percentage = (score * 100.0) / totalQuestions;

        System.out.println("\nTotal Score: " + score + "/" + totalQuestions);
        System.out.println("Percentage: " + percentage + "%");

        // pass or fail logic
        if (percentage >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

