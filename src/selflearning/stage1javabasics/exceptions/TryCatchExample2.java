package selflearning.stage1javabasics.exceptions;

public class TryCatchExample2 {
    public static void main(String[] args) {
        String[] names = {"Hari", "Gopal", "Muvvala"};

        System.out.println("Trying to access array elements...");

        try {
            // Accessing out-of-bounds index (index 3 doesn't exist)
            System.out.println("Fourth name: " + names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: Index out of range!");
        }

        System.out.println("Program continues after handling the array exception.");
    }
}