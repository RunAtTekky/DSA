import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        int n = 20;
        int[] ans = countBits(n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            ans[i] = count(i);
        }
        return ans;
    }
    public static int count(int n) {
        int ans = 0;
        while (n>0) {
            if ((n&1) == 1) ans++;
            n = n>>1;
        }
        return ans;
    }
}
