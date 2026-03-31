package annotations.jsonfield;

import java.lang.reflect.Field;

class UserJson {
    @JsonField(name = "user_name")
    String name = "Saket";

    @JsonField(name = "user_age")
    int age = 22;
}
