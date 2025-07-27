package trainertasks.day21;

// Abstraction – both Clothes and Books will implement this
interface IProduct {
    void seeReview();
    void getSample();
}

// Low-level module 1: Clothes implements IProduct
class Clothes2 implements IProduct {
    @Override
    public void seeReview() {
        System.out.println("Clothes review: 4.5 stars");
    }

    @Override
    public void getSample() {
        System.out.println("Showing clothes sample.");
    }
}

// Low-level module 2: Books implements IProduct
class Books2 implements IProduct {
    @Override
    public void seeReview() {
        System.out.println("Books review: 4.8 stars");
    }

    @Override
    public void getSample() {
        System.out.println("Showing book sample.");
    }
}

// High-level module: Cupboard depends on abstraction (IProduct)
class Cupboard2 {
    public void addProduct(IProduct product) {
        System.out.println("Adding product to cupboard...");
        product.getSample();     // Uses abstraction
        product.seeReview();     // Uses abstraction
    }
}

// Driver class
public class Task6_DIPCorrect {
    public static void main(String[] args) {
        Cupboard2 cupboard = new Cupboard2();

        // Add Clothes
        IProduct clothes = new Clothes2();
        cupboard.addProduct(clothes);

        System.out.println("------");

        // Add Books
        IProduct book = new Books2();
        cupboard.addProduct(book);
    }
}