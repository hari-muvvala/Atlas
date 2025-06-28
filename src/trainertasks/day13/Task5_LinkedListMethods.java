package trainertasks.day13;

import java.util.LinkedList;
import java.lang.reflect.Method;

public class Task5_LinkedListMethods {
    public static void main(String[] args) {
        Method[] methods = LinkedList.class.getDeclaredMethods();

        System.out.println("All methods of LinkedList class:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}