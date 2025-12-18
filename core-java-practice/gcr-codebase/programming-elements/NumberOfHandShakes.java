import java.util.Scanner;

public class NumberOfHandShakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Formula to calculate maximum number of handshakes
        int maximumHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; 
        System.out.println(
            "The maximum number of possible handshakes among "+ numberOfStudents + " students is "+ maximumHandshakes
        );
    }
}
