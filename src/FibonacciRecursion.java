public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fibonacci(6);
        System.out.println(ans);
    }
    static int fibonacci(int n) {
        // Base condition
        if (n<2) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
