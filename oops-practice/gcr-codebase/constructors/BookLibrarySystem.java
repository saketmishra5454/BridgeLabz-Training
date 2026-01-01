//Book Library System

public class BookLibrarySystem {

    public int ISBN;          // public member 
    protected String title;       // protected member
    private String author;     // private member

     // constructor     

    BookLibrarySystem(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor(){                         // getter method
        return author;
    }
    public void setAuthor(String author){        // setter method
        this.author = author;
    }
public void displayBookDetails(){          // method to display book details
    System.out.println("ISBN: " + ISBN);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);    


}
public static void main(String[] args){                           // main method
    BookLibrarySystem book1 = new BookLibrarySystem(123456, "Java Programming", "John Doe");
    System.out.println("----------Book 1 Detail----------");
    book1.displayBookDetails();

    book1.setAuthor("Jane Smith");                   // updating author using setter
    System.out.println("-------------Updated Book 1 Detail------------");
    book1.displayBookDetails();

    System.out.println("\nUpdated Author: " + book1.getAuthor());

}
}

class Ebook extends BookLibrarySystem{        // child class
    String format;

    public Ebook(int ISBN, String title, String author, String format){
        super(ISBN, title, author);        // calling parent constructor
        this.format = format;
    }

    public void displayEbookDetails(){           // method to display ebook details
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("Format: " + format);
    }
}



    

