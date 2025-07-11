package trainertasks.day16;

public class Task11_RecursiveSum {
    public int calc(int n) {
        if (n == 0) return 0;           // Base case
//        return n + calc(n);
        return n + calc(n - 1);         // Recursive step with n reduced
    }

    public static void main(String[] args) {
        Task11_RecursiveSum obj = new Task11_RecursiveSum();
        int result = obj.calc(5);
        System.out.println("Result: " + result);
    }
}