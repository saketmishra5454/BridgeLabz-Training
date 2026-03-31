import java.util.*;

// Custom Exception for invalid time format
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String message) {
        super(message);
    }
}

// Main Manager class for cinema movie schedules
class CinemaTimeManager {

    // Using List for titles & showtimes (separate lists but same index)
    private List<String> movieTitles;
    private List<String> movieTimes;

    // Constructor initializes the lists
    public CinemaTimeManager() {
        movieTitles = new ArrayList<>();
        movieTimes = new ArrayList<>();
    }

    // Method to validate time format like "HH:MM"
    private boolean isValidTime(String time) {
        // Simple validation split by ":"
        String[] parts = time.split(":");
        
        // We must have exactly 2 parts
        if (parts.length != 2) return false;

        try {
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);

            // hour must be 0-23 and minute must be 0-59
            return (hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to add movie with title & time
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        
        // checking time before adding
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        
        movieTitles.add(title);
        movieTimes.add(time);
        System.out.println("Movie Added: " + title + " at " + time);
    }

    // Method to display all movies
    public void displayAllMovies() {
        System.out.println("\n--- All Movies ---");
        for (int i = 0; i < movieTitles.size(); i++) {
            // Formatting output using concatenation
            System.out.println((i+1) + ". " + movieTitles.get(i) + " - " + movieTimes.get(i));
        }
    }

    // Method to search movies by keyword
    public void searchMovie(String keyword) {
        System.out.println("\n--- Search Results for: " + keyword + " ---");
        boolean found = false;

        for (int i = 0; i < movieTitles.size(); i++) {
            // contains() for matching keywords
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(movieTitles.get(i) + " at " + movieTimes.get(i));
                found = true;
            }
        }
        if (!found) System.out.println("No matching movies found!");
    }

    // Method that tries to access movie using index safely
    public void printMovieByIndex(int index) {
        try {
            System.out.println("Movie: " + movieTitles.get(index) + " at " + movieTimes.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid movie index!");
        }
    }

    // Method to convert lists to arrays (useful for reports)
    public void generateReport() {
        System.out.println("\n--- Report (List to Array) ---");

        String[] titleArray = movieTitles.toArray(new String[0]);
        String[] timeArray = movieTimes.toArray(new String[0]);

        // printing array report
        for (int i = 0; i < titleArray.length; i++) {
            System.out.println(String.format("Movie: %s | Time: %s", titleArray[i], timeArray[i]));
        }
    }
}


// MAIN CLASS to test the system like a beginner student
public class MovieScheduleManager{
    public static void main(String[] args) {

        // create manager object
        CinemaTimeManager manager = new CinemaTimeManager();

        try {
            manager.addMovie("Avengers", "18:30");
            manager.addMovie("Batman", "20:15");
            manager.addMovie("Superman", "25:99"); // invalid -> will throw exception
        } catch (InvalidTimeFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        manager.displayAllMovies();     // display movies
        manager.searchMovie("bat");     // searching by keyword
        manager.printMovieByIndex(5);   // invalid index -> exception handled
        manager.generateReport();       // converting list to array
    }
}
