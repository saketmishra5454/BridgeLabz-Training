package streamApi.event_welcome_message;
import java.util.*;

public class EventService {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Saket",
                "Abhishek",
                "Virat",
                "Neha",
                "Vikram"
        );

        // 👇 YOUR LOGIC STARTS HERE

        attendees.forEach(name-> System.out.println("Welcome " + name + " to the Tech Conference 2026!"));

    }
}
