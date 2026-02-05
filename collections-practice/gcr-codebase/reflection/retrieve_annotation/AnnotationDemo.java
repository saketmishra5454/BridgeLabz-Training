package reflection.retrieve_annotation;

public class AnnotationDemo {

    public static void main(String[] args) {

        Class<Book> c = Book.class;

        Author a = c.getAnnotation(Author.class);

        System.out.println("Author = " + a.name());
    }
}

