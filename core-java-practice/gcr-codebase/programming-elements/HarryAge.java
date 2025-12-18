import java.util.Scanner;
public class HarryAge {
    public static void main(String[] args) {
        int currentyear = 2024;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of Harry: ");
        int harryage = scanner.nextInt();
        int birthyear = currentyear - harryage;
        System.out.println("Harry was born in the year: " + birthyear);

    }
    
}
