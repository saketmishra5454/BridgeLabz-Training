package junit.userregistration;

public class UserRegistration {
    public void registerUser(String username, String email, String password){
        if(username.isEmpty() || email.isEmpty() || password.length() < 6){
            throw new IllegalArgumentException();
        }
    }
}
