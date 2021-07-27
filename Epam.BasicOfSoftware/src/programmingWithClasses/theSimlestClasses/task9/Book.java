package programmingWithClasses.theSimlestClasses.task9;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int publishYear;
    private int amountPage;
    private int Price;
    private int typeCover;

    public Book(String author, String publishingHouse, int publishYear) {
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getTypeCover() {
        return typeCover;
    }

    public void setTypeCover(int typeCover) {
        this.typeCover = typeCover;
    }
}
