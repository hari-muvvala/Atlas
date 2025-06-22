package selflearning.stage1javabasics.exceptions;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    static void tryAge(int age) throws CustomException {
        if (age < 16) throw new CustomException("Age is less than 18, not valid age");
        else System.out.println("Valid age, more than 18");
    }

    public static void main(String[] args) {
        try {
            tryAge(28);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}