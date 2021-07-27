package programmingWithClasses.theSimlestClasses.task9;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private final ArrayList<Book> arrayListLibrary;

    public Library(Book[] books) {
        arrayListLibrary = new ArrayList<>(Arrays.asList(books));

    }
    public void searchBooksAuthor(String author){
        for(Book book: arrayListLibrary){
            if (book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
        System.out.println("======================================");
    }
    public void searchBooksPublishingHouse(String publishingHouse){
        for(Book book: arrayListLibrary){
            if (book.getPublishingHouse().equals(publishingHouse)) {
                System.out.println(book.toString());
            }
        }
        System.out.println("=========================================");
    }
    public void searchBooksAfterYear(int year){
        for(Book book: arrayListLibrary){
            if (book.getPublishYear()>year) {
                System.out.println(book.toString());
            }
        }
        System.out.println("============================================");
    }
}
