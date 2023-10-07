import java.util.ArrayList;

public class CountArrays {
    public static void main(String[] args) {
        int ans = numOfArrays(50,100,25);
        System.out.println(ans);
    }
    public static int numOfArrays(int n, int m, int k) {
        return countArrays( n, m, k, Integer.MIN_VALUE);

    }
    static int countArrays(int n, int m, int k, int maxArr) {
        int count = 0;
        if (n==0) {
            if (k==0) return 1;
            else return 0;
        }
        for (int i=1; i<=m; i++) {
            if (i > maxArr) {
                count += countArrays( n-1, m, k-1, i);
            } else {
                count += countArrays( n-1, m, k, maxArr);
            }
        }
        return count;
    }
}
