import java.util.LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        boolean ans = isHappy(19);
        System.out.println(ans);
    }

    static boolean isHappy(int n) {
        LinkedList<Integer> happy = new LinkedList<>();
        while (digSquareSum(n) != 1) {
            happy.add(digSquareSum(n));

            n = digSquareSum(n);
        }
        return true;
    }
    static boolean isCycle(LinkedList<Integer> list) {
        return true;
    }

    static int digSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num%10;
            sum += rem*rem;
            num = num/10;
        }
        return sum;
    }
}
