public class FitnessTracker {
    public static void main(String[] args) {

        int[] pushUps = {30, 0, 25, 40, 0, 35, 20};

        int totalPushUps = 0;
        int workoutDays = 0;

      //using for-each loop to process data 
        for (int count : pushUps) {

            //lag: skipping rest days 
            if (count == 0) {
                continue;   // rest day, move to next day
            }

            // lag: adding valid workout data
            totalPushUps += count;
            workoutDays++;
        }

        //lag: calculating average safely 
        double average = 0;
        if (workoutDays > 0) {
            average = (double) totalPushUps / workoutDays;
        }

        // ---- lag: displaying final results ----
        System.out.println("Sandeep’s Weekly Fitness Report");
        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Workout Days: " + workoutDays);
        System.out.println("Average Push-ups per Workout Day: " + average);

    }
}
