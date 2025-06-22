package day7;

class Customer{
    void accept(){
        System.out.println("accept customer called");
    }

    void display(){
        System.out.println("display customer called");
    }
}

public class Task008 {
    public static void main(String[] args) {
        // day7.Task008: Use object to call methods from customer class

        Customer cobj = new Customer();
        cobj.accept();
        cobj.display();
    }
}