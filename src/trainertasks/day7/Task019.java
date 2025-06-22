package day7;

public class Task019 {
    public static void main(String[] args) {
        for (Element e : Element.values()){
            System.out.println("day7.Element: " + e);
            System.out.println("Label: " + e.getLabel());
            System.out.println("Atomic Number: " + e.getAtomicNumber());
            System.out.println("Atomic weight: " + e.getAtomicWeight());
            System.out.println("----------------------");
        }
    }
}
