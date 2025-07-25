package trainertasks.day20;

// Handles price calculation logic — separate responsibility
public class Task3_DiscountCalculator {
    public double calculateDiscountedPrice(Task3_Book book, double discountPercent) {
        return book.getPrice() * (1 - discountPercent);
    }
}