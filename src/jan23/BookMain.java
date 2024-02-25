package jan23;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book();
        Book book1 = new Book("My second book", "Manish Mehta", 2025);

        book.printBookInfo();
        book1.printBookInfo();
    }
}
