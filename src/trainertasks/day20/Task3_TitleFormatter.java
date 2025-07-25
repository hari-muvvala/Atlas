package trainertasks.day20;

// Formats the book title — separate responsibility
public class Task3_TitleFormatter {
    public String getFormattedTitle(Task3_Book book) {
        return "Title: " + book.getTitle().toUpperCase();
    }
}