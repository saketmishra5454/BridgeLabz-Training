package streamApi.email_notifications;

import java.util.*;

public class EmailService {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "rahul@gmail.com",
                "saket@yahoo.com",
                "amit@outlook.com",
                "neha@gmail.com"
        );

       emails.forEach(email-> System.out.println("Sending email to: " + email));

    }
}
