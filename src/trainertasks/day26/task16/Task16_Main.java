package trainertasks.day26.task16;

public class Task16_Main {
    public static void main(String[] args) {
        DManager manager = DManager.getInstance();

        manager.addItem("Doc1");
        manager.addItem("Doc2");
        manager.listItems();

        manager.removeItem("Doc1");
        manager.listItems();
    }
}