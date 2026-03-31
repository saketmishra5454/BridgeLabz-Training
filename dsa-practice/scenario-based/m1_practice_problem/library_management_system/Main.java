package collections.library_management_system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("***************************************");
            System.out.println("1.Add Book\n2.Remove Book\n3.Search Book\n4.Update Book Name\n5.Display Books");

            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter BookId BookName Author");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String bookName = sc.nextLine();
                    String author = sc.nextLine();
                    
                    library.addBook(id,bookName,author);
                   
                    break;

                case 2:
                    System.out.println("Enter BookId to remove");
                    library.removeBook(sc.nextInt());
                    break;

                case 3:
                    System.out.println("Enter BookId to search");
                    library.searchBook(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter BookId and New Name");
                    library.updateBook(sc.nextInt(),sc.next());
                    break;

                case 5:
                    library.displayBooks();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}