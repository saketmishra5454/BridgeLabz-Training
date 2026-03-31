import java.util.*;

// This class will manage the full exam process for ONE student
class ExamProctor {
    
    Stack<Integer> navStack;              // Stack to track last visited question
    HashMap<Integer, String> answers; // Map to store answers questionID → answer
    HashMap<Integer, String> correctAnswers;          // Correct answers for evaluation

    // Constructor to initialize required data structures
    public ExamProctor() {
        navStack = new Stack<>();
        answers = new HashMap<>();
        correctAnswers = new HashMap<>();

        // preloading correct answers (like set by teacher)
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
        correctAnswers.put(4, "D");
        correctAnswers.put(5, "A");
    }

    // Function: student navigates to a question
    public void visitQuestion(int questionID) {
        navStack.push(questionID);
        System.out.println("Visited Question: " + questionID);
    }

    // Function: student submits answer for a question
    public void submitAnswer(int questionID, String ans) {
        answers.put(questionID, ans);
        System.out.println("Answer saved: Q" + questionID + " = " + ans);
    }

    // Function: show last question visited (stack peek)
    public void showLastVisited() {
        if (!navStack.isEmpty()) {
            System.out.println("Last visited question: " + navStack.peek());
        } else {
            System.out.println("No navigation yet!");
        }
    }

    // Function: auto-evaluate score based on correct answers
    public int calculateScore() {
        int score = 0;

        // loop through student's answers
        for (int qID : answers.keySet()) {
            String studentAns = answers.get(qID);
            String correctAns = correctAnswers.get(qID);

            // compare both answers
            if (studentAns.equals(correctAns)) {
                score++; // increase score if correct
            }
        }
        return score;
    }

    // Function: submit exam and show final score
    public void submitExam() {
        int finalScore = calculateScore();
        System.out.println("\n=== Exam Submitted ===");
        System.out.println("Your Score: " + finalScore + "/" + correctAnswers.size());
    }
}

// Main class for testing (like a student running demo)
public class ExamProctorSystem {
    public static void main(String[] args) {

        // creating one student's exam session
        ExamProctor student = new ExamProctor();

        // navigation simulation
        student.visitQuestion(1);
        student.submitAnswer(1, "A");

        student.visitQuestion(2);
        student.submitAnswer(2, "B"); // wrong (correct is C)

        student.visitQuestion(3);
        student.submitAnswer(3, "B");

        student.visitQuestion(4);
        student.submitAnswer(4, "D");

        student.visitQuestion(5);
        student.submitAnswer(5, "A");

        // last visited question check using stack peek
        student.showLastVisited();

        // final submission
        student.submitExam();
    }
}
