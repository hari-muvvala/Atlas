package trainertasks.day20;

// Holds only book data — SRP respected
public class Task3_Book {
    private String title;
    private String author;
    private double price;

    public Task3_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}