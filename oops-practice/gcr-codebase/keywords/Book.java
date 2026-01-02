// Library class with static and final keywords

public class Book {              // Book class
    static String libraryName = "Veer Sawarkar Library";

    String title;
    String author;                 
    final int isbn;

    Book(String title, String author,int isbn){             // constructor using this keyword
        this.title = title;             //  instance variables
        this.author = author;             // instance variables
        this.isbn = isbn;          // final variable
    }          // constructor ends

    public static void displayLibraryName(){                    // static method
        System.out.println("The Library Name is: "+libraryName);
    }
    public void displayBookDetails(Object obj){           // instance method using instanceof
       
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
        }
    public static void main(String[] args) {                // main method
        Book b = new Book("Java Programming","James Gosling",123456);
        Book.displayLibraryName();


    if (b instanceof Book) {             // checking instance using instanceof
        b.displayBookDetails(b);
        }
        else {
        System.out.println("Not a valid Book object");  
        }
    }
}




