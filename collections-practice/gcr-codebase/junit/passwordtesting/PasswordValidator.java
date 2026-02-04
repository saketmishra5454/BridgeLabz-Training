package junit.passwordtesting;

public class PasswordValidator {
     // method to validate the password
    public boolean isValid(String str){
        return str.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%])[A-Za-z0-9!@#$%]{8,}$");
    }
}
