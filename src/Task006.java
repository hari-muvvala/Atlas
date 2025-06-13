public class Task006 {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            int b = 0;
            System.out.println("Access element three: " + a[3]); // ArrayIndexOutOfBoundsException
            int c = 1 / b; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown: " + e);
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }

        System.out.println("Out of the block");
    }
}