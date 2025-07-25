package trainertasks.day20;

// Main class to test SRP-compliant Book logic
public class Task3_SRP_Main {
    public static void main(String[] args) {
        Task3_Book book = new Task3_Book("Effective Java", "Joshua Bloch", 750.0);

        Task3_TitleFormatter formatter = new Task3_TitleFormatter();
        System.out.println(formatter.getFormattedTitle(book));

        Task3_DiscountCalculator calculator = new Task3_DiscountCalculator();
        double discountedPrice = calculator.calculateDiscountedPrice(book, 0.15); // 15% discount
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }
}