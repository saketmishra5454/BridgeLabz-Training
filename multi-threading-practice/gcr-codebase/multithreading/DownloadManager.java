import java.util.Random;

// ===============================
// 1. Thread Class Approach
// ===============================
class FileDownloaderThread extends Thread {

    private String fileName;
    private Random random = new Random();

    public FileDownloaderThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i <= 100; i += 10) {

                System.out.println("[" + getName() + "] Downloading "
                        + fileName + ": " + i + "%");

                // Random delay (200ms to 600ms)
                Thread.sleep(200 + random.nextInt(400));
            }

            System.out.println("[" + getName() + "] " + fileName + " Download Completed");

        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
    }
}


// ===============================
// 2. Runnable Interface Approach
// ===============================
class FileDownloaderRunnable implements Runnable {

    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i <= 100; i += 10) {

                System.out.println("[" + Thread.currentThread().getName() +
                        "] Downloading " + fileName + ": " + i + "%");

                // Random delay (200ms to 600ms)
                Thread.sleep(200 + random.nextInt(400));
            }

            System.out.println("[" + Thread.currentThread().getName() +
                    "] " + fileName + " Download Completed");

        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
    }
}


// ===============================
// Main Class
// ===============================
public class DownloadManager {

    public static void main(String[] args) {

        System.out.println("=== Thread Class Approach ===");

        // Using Thread class
        FileDownloaderThread t1 =
                new FileDownloaderThread("Document.pdf");

        FileDownloaderThread t2 =
                new FileDownloaderThread("Image.jpg");

        FileDownloaderThread t3 =
                new FileDownloaderThread("Video.mp4");

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n=== Runnable Interface Approach ===");

        // Using Runnable interface
        Thread r1 = new Thread(
                new FileDownloaderRunnable("Document.pdf"));

        Thread r2 = new Thread(
                new FileDownloaderRunnable("Image.jpg"));

        Thread r3 = new Thread(
                new FileDownloaderRunnable("Video.mp4"));

        // Start threads
        r1.start();
        r2.start();
        r3.start();

        // Wait for threads
        try {
            r1.join();
            r2.join();
            r3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final message
        System.out.println("\nAll downloads complete");
    }
}