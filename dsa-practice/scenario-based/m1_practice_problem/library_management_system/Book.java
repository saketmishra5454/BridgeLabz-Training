package collections.library_management_system;

class Book {

    private int bookId;
    private String bookName;
    private String author;

    public Book(int bookId,String bookName,String author){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public int getBookId(){
        return bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public String getAuthor(){
        return author;
    }
    
    public void setBookName(String bookName) {
    	this.bookName = bookName;
    }
}