public class DigitalWatchSimulation {

    public static void main(String[] args) {

        // starting 24-hour digital watch 
        for (int hour = 0; hour < 24; hour++) {

            //  minute loop starts for each hour 
            for (int minute = 0; minute < 60; minute++) {

                // simulating power cut at 13:00
                if (hour == 13 && minute == 0) {
                    System.out.println("Power cut at 13:00! Watch stopped.");
                    break;   // stop minute loop
                }

                //  formatting time display 
                System.out.printf("Time: %02d:%02d\n", hour, minute);
            }

            
            if (hour == 13) {
                break;   // stop hour loop
            }
        }
    }
}

