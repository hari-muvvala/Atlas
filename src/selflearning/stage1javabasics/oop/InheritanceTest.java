package selflearning.stage1javabasics.oop;

public class InheritanceTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";
        d.eat();
        d.bark();
        System.out.println("selflearning.stage1javabasics.oop.Dog's name: " + d.name);

        Cat c = new Cat();
        c.name = "Kitty";
        c.eat();
        c.meow();
        System.out.println("selflearning.stage1javabasics.oop.Cat's name: " + c.name);
    }
}