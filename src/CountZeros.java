public class CountZeros {
    public static void main(String[] args) {
        System.out.println(cntZeros(600020, 0));
    }

    static int cntZeros(int n, int cnt) {
        if (n==0) return cnt;
        if (n%10==0) {
            return cntZeros(n/10, cnt+1);
        }
        else {
            return cntZeros(n/10, cnt);
        }
    }
}
