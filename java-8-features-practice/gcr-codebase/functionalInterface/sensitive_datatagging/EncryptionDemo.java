package functionalInterface.sensitive_datatagging;
public class EncryptionDemo {

    public static void process(Object obj) {

        // Check marker interface
        if (obj instanceof SensitiveData) {

            System.out.println(
                    "Encrypting sensitive data...");

        } else {

            System.out.println(
                    "Normal data");
        }
    }

    public static void main(String[] args) {

        BankAccount b =
                new BankAccount();

        process(b);
    }
}
