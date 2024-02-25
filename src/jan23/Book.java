package jan23;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book() {
        
        title = "My first Book";
        author = "Manish";
        publicationYear = 2024;
    }

    public Book(String title, String author) {
        this(); // calling default constructor
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int publicationYear) {
        this(title, author);
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public void printBookInfo() {
        System.out.println((title + "=====" + author + "=====" + publicationYear));
    }

}
