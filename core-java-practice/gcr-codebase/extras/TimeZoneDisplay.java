import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Fetching current time for Indian Standard Time
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Getting time for Pacific Standard Time
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Displaying all time
        System.out.println("Current Time in GMT  : " + gmtTime);
        
        // Printing IST time separately
        System.out.println("Current Time in IST  : " + istTime);

        // Finally printing PST time
        System.out.println("Current Time in PST  : " + pstTime);
    }
}

