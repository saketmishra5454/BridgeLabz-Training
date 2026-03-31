import java.util.Arrays;

public class RandomNumberAnalysis {
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            sum += num; // adding for average

            // finding min using Math.min
            min = (int) Math.min(min, num);

            // finding max using Math.max
            max = (int) Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display generated numbers
        System.out.println("Generated 4-digit random numbers:");
        System.out.println(Arrays.toString(randomNumbers));

        // Find average, min and max
        double[] result = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}

