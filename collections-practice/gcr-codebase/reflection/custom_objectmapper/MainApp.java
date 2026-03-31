package reflection.custom_objectmapper;

import java.util.HashMap;
import java.util.Map;

// Main class
public class MainApp {
    public static void main(String[] args) {
        try {
            // Create Map
            Map<String, Object> data =
                    new HashMap<>();

            data.put("name", "Saket Mishra");
            data.put("age", 21);

            // Convert Map to Student Object
            Student student =
                    ObjectMapperUtil.toObject(
                            Student.class,
                            data);
            // Print result
            System.out.println("Student Details:");
            student.display();
        }
        catch (Exception e) {
            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}
