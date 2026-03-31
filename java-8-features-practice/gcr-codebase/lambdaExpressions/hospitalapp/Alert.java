package hospitalapp;

// Alert class to store alert details
public class Alert {

    String message;
    String type;   // example: CRITICAL, NORMAL, INFO

    // Constructor
    Alert(String message, String type) {

        this.message = message;
        this.type = type;
    }

    // Method to display alert
    public void display() {

        System.out.println(type + " : " + message);
    }
}

