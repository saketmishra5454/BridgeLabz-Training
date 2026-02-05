package annotations.max_length;

import java.lang.reflect.Field;

class User {

    // Applying MaxLength on username field
    @MaxLength(8)
    private String username;

    // Constructor to validate length
    User(String name) throws Exception {

        // Getting Field object using reflection
        Field field =
                this.getClass().getDeclaredField("username");

        // Getting annotation from field
        MaxLength max =
                field.getAnnotation(MaxLength.class);

        // Checking length condition
        if (name.length() > max.value()) {

            throw new IllegalArgumentException(
                    "Username too long! Max = " + max.value());
        }

        // Assigning value
        username = name;
    }

    // Getter method
    public String getUsername() {

        return username;
    }
}
