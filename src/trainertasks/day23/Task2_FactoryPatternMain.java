package trainertasks.day23;

public class Task2_FactoryPatternMain {
    public static void main(String[] args) {
        PizzaFactory factory = new PepperoniPizzaFactory();
        Pizza pizza = factory.createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}