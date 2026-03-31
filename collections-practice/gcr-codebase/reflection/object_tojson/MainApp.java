package reflection.object_tojson;

// Main class
public class MainApp {

    public static void main(String[] args) {
        try {
            // Create Student object
            Student s =
                    new Student(
                            "Saket Mishra",
                            21,
                            "Computer Science");
            // Convert to JSON
            String json =
                    JsonUtil.toJson(s);
            // Print JSON
            System.out.println("JSON Output:");
            System.out.println(json);
        }
        catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}

