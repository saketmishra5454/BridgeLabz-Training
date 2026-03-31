package collections.library_book_ratingsystem;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Library lib = new Library();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number of Operations you want:");
		int n = sc.nextInt();
		
		for(int i = 0; i<n;i++) {
			System.out.println("************************************************");
		System.out.println("1.Add Book\n2.Remove Book\n3.Add Rating\n4.Calculate AverageRating\n5.Top Rated Book\n6.DisplayBooks");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Book Details like (Title,Author)");
			String name = sc.next();
			String author = sc.next();
			lib.addBook(name,author);
			break;
			
		case 2: 
			System.out.println("Enter the Title of book you want to delete");
			
			lib.removeBook(sc.next());
			break;
			
		case 3:
			System.out.println("Enter the Title and Ratins as (title,rating)");
			
			lib.addRating(sc.next(), sc.nextInt());
			break;
			
		case 4:
			System.out.println("Enter the title for AverageRating:");
			
			lib.calculateAverageRating(sc.next());
			break;
			
		case 5:
			lib.topRatedBook();
			break;
			
		case 6:
			System.out.println("These are the Details of Books");
			
			lib.displayBooks();
			break;
			
		default:
			System.out.println("Invalid Number!! Plz Try again");
		}
		}
		sc.close();
		
	}

}
