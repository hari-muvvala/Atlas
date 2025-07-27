package trainertasks.day21;

// Low-level class: Clothes
class Clothes {
    void seeRating() {
        System.out.println("Clothes rating: 4.5");
    }

    void viewSample() {
        System.out.println("Viewing clothes sample.");
    }
}

// High-level class: Cupboard — directly depends on Clothes (tight coupling)
class Cupboard {
    Clothes clothes;

    // Only works with Clothes — violates DIP
    void addClothes(Clothes c) {
        this.clothes = c;
        System.out.println("Clothes added to cupboard.");
    }

    void customizeClothes() {
        System.out.println("Customizing clothes in cupboard.");
        clothes.viewSample();
    }
}

// New request: customer wants to add Books
// We must modify Cupboard again — violates OCP and DIP
class Books {
    void seeRating() {
        System.out.println("Books rating: 4.8");
    }

    void readSample() {
        System.out.println("Reading book sample.");
    }
}

// Driver class
public class Task5_DIPViolation {
    public static void main(String[] args) {
        Clothes shirt = new Clothes();
        Cupboard cupboard = new Cupboard();
        cupboard.addClothes(shirt);
        cupboard.customizeClothes();

        // Now we want to add Books — but cupboard doesn’t support it
        // We'd have to write another addBooks() — not scalable
        Books book = new Books();
        book.seeRating();
        book.readSample();
    }
}