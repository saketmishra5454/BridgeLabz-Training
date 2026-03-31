package filebackupscheduler;

// custom exception for invalid backup path
public class InvalidBackupPathException extends Exception {

    public InvalidBackupPathException(String message) {
        super(message);
    }
}
