package collections.library_management_system;


import java.util.*;

class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(int id,String name,String author){
        // write logic
    
    	for(Book book :books) {
    		if(book.getBookId() == id) {
    			System.out.println("Book is Already Existis");
    			return;
    		}
    		
    	}
    	
    	books.add(new Book(id,name,author));
    	System.out.println("Book Added Successfully");
   	
    }

    public void removeBook(int id){
        // write logic
    	Iterator<Book> it = books.iterator();
    	while(it.hasNext()) {
    		Book idd = it.next();
    		if(idd.getBookId() == id) {
    			it.remove();
    			System.out.println("Book Removed Successfully");
    			return;
    		}
    	}
    	System.out.println("Book is not found");
    }

    public void searchBook(int id){
        // write logic
    	if(books.isEmpty()) {
    		System.out.println("No Book is Available");
    		return;
    	}
    	
    	for(int i = 0; i<books.size();i++) {
    		Book b = books.get(i);
    		if(b.getBookId() == id) {
    			System.out.println("Book Name: "+b.getBookName());
    			System.out.println("Author: "+b.getAuthor());
    			return;
    		}
    	}
    	System.out.println("Book not found");
    
    }

    public void updateBook(int id,String newName){
        // write logic
    	if(books.isEmpty()) {
    		System.out.println("No Book is Available");
    		return;
    	}
    	
    	for(int i= 0;i<books.size();i++) {
    		Book book = books.get(i);
    		
    		if(book.getBookId() == id) {
    			book.setBookName(newName);
    			System.out.println("Book Name updated Successfully");
    			return;
    			
    		}
    	}
    	System.out.println("Book not found");
    }

    public void displayBooks(){
        // write logic
    	for(int i = 0;i<books.size();i++) {
    		Book bok = books.get(i);
    		
    		System.out.println("Book id: "+bok.getBookId());
    		System.out.println("Name: "+ bok.getBookName());
    		System.out.println("Author: "+bok.getAuthor());
    		System.out.println("----------------------------------");
    	}
    }
}