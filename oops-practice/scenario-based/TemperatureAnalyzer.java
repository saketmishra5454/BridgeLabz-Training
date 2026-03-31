import java.util.Random;

public class TemperatureAnalyzer {
    public static void main(String[] args) {

        // Creating the object of Temperature class
        Temperature week1 = new Temperature();

        // To display the Hottest and coldest day in week1
        week1.hottestAndColdest();

        // To Display the average temperature of all days of the week
        week1.averageTemperature();
    }
}

class Temperature {
    float[][] temperature;                                              // Stores the temperature of every hour of every day of week

    // Constructor of Temperature class
    public Temperature() {
        this.temperature = generateRandom();
    }

    // This method Generate the float[][] array using random class
    public float[][] generateRandom() {
        Random rand = new Random();
        float[][] array = new float[7][24];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {                                   // Generates the random float value between 12 and 30
                array[i][j] = 12+rand.nextFloat()*(18);
            }
        }
        return array;
    }

    // This method calculates the average temperature of every day
    public float[] average() {
        float[] average = new float[7];
        for (int i = 0; i < 7; i++) {
            float sum = 0;
            for (int j = 0; j < 24; j++) {
                sum += temperature[i][j];
            }
            average[i] = sum / 24;
        }
        return average;
    }

    // This method prints the average temperature of every day
    public void averageTemperature(){
        float[] average = this.average();
        for (int i = 0; i < 7; i++) {
            System.out.printf("Average temperature for %d Day is : %.2f\n",(i+1),average[i]);
        }
        System.out.println("________________________________________________________________________________________");
    }

    // This method prints the hottest and coldest day
    public void hottestAndColdest(){
        float[] average = this.average();
        int maxTempearture = 0;
        int minTempearture = 0;
        for (int i = 0; i < 7; i++) {
            if (average[i] > average[maxTempearture]) {
                maxTempearture = i;
            }
            if (average[i] < average[minTempearture]) {
                minTempearture = i;
            }
        }
        System.out.printf("Day %d is Hottest Day of this week with temperature : %.2f degree celsius\n",(maxTempearture+1),(average[maxTempearture]));
        System.out.printf("Day %d is Coldest Day of this week with temperature : %.2f degree celsius\n",(minTempearture+1),(average[minTempearture]));
        System.out.println("__________________________________________________________________________________________________");
    }
}
