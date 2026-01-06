// custom exception for invalid score
class InvalidScoreException extends Exception {

    InvalidScoreException(String msg) {
        super(msg);
    }
}

public class StudentScoreAnalyzer {

    // method to calculate average score
    static double calculateAverage(int[] scores) throws InvalidScoreException {

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            // checking score range
            if (scores[i] < 0 || scores[i] > 100) {
                throw new InvalidScoreException("Invalid score found: " + scores[i]);
            }

            sum = sum + scores[i];
        }

        return (double) sum / scores.length;
    }

    // method to find highest score
    static int findMax(int[] scores) throws InvalidScoreException {

        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {

            // validate score
            if (scores[i] < 0 || scores[i] > 100) {
                throw new InvalidScoreException("Invalid score found: " + scores[i]);
            }

            if (scores[i] > max) {
                max = scores[i];
            }
        }

        return max;
    }

    // method to find lowest score
    static int findMin(int[] scores) throws InvalidScoreException {

        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {

            // checking score valid or not
            if (scores[i] < 0 || scores[i] > 100) {
                throw new InvalidScoreException("Invalid score found: " + scores[i]);
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        // array of student scores
        int[] scores = {78, 85, 92, 67, 88};

        try {

            double avg = calculateAverage(scores);
            int highest = findMax(scores);
            int lowest = findMin(scores);

            System.out.println("Average Score: " + avg);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);

        } catch (InvalidScoreException e) {

            // handling invalid score error
            System.out.println("Error: " + e.getMessage());
        }
    }
}

