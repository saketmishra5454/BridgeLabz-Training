package functionalInterface.background_jobexecution;

public class BackgroundJobDemo {

    public static void main(String[] args) {
        // Runnable using lambda
        Runnable job = () -> {
            System.out.println("Job started...");

            try {

                Thread.sleep(2000); // simulate work

            } catch (Exception e) {

                System.out.println("Error");
            }

            System.out.println("Job completed");
        };

        // Running job in new thread
        Thread t = new Thread(job);

        t.start();

        System.out.println("Main thread continues...");
    }
}
