package filebackupscheduler;

// main class to test file backup scheduler
public class Main {

    public static void main(String[] args) {

        BackupScheduler scheduler = new BackupScheduler();

        try {
            // adding backup tasks
            scheduler.addBackupTask("C:/Documents", 2, "10:00 PM");
            scheduler.addBackupTask("C:/SystemFiles", 5, "9:00 PM"); // critical folder
            scheduler.addBackupTask("D:/Movies", 1, "11:00 PM");

            // this will throw exception
            scheduler.addBackupTask("", 3, "8:00 PM");

        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        // execute all backups
        scheduler.executeBackups();
    }
}
