package programmingWithClasses.theSimlestClasses.task9;

public class MainTask9 {
    public static void main(String[] args) {
        Book book = new Book("Tven","Tor Books",1910);
        Book book1 = new Book("Tolstoy","Oma",1908);
        Book book2 = new Book("Gogol","Oma",1890);
        Book book3 = new Book("Kolos","Oma",1896);
        Book book4 = new Book("Duma","Tor Books",1910);
        Book book5 = new Book("Duma","Tor Books",1910);
        Book[] books = new Book[]{book, book1, book2, book3, book4, book5};
        Library library = new Library(books);
        library.searchBooksAuthor("Duma");
        library.searchBooksPublishingHouse("Oma");
        library.searchBooksAfterYear(1900);

    }
}
