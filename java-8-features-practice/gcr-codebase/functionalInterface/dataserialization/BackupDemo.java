package functionalInterface.dataserialization;

public class BackupDemo {

    // Method to process backup
    public static void backup(Object obj) {

        // Checking marker interface
        if (obj instanceof Backupable) {

            System.out.println("Backing up data...");

        } else {

            System.out.println("Not allowed for backup");
        }
    }

    public static void main(String[] args) {

        UserData u = new UserData("Saket", 101);

        backup(u);
    }
}
