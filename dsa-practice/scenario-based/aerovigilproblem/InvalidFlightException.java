package aerovigilproblem;
 //Custom Exception Class

public class InvalidFlightException extends Exception {

    // Constructor to pass error message
    public InvalidFlightException(String message) {
        super(message);
    }
}
