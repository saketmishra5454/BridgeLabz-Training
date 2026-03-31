package annotations.roleallowed;

import java.lang.reflect.Method;

public class RoleDemo {

    public static void main(String[] args) throws Exception {

        String userRole = "USER"; // change to ADMIN

        AdminService s = new AdminService();

        Method m = s.getClass().getMethod("delete");

        RoleAllowed r =
                m.getAnnotation(RoleAllowed.class);

        if (r.value().equals(userRole)) {

            m.invoke(s);

        } else {

            System.out.println("Access Denied!");
        }
    }
}
