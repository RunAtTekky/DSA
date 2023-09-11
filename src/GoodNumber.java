public class GoodNumber {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        long n = 4;
        long odd = n/2;
        long even = n-odd;

        int ans = (int)(((pow(5,even)%MOD)*(pow(4,odd)%MOD))%MOD);
        System.out.println(ans);


    }

    static long pow(long base, long pow) {
        if (pow != 0) {
            return base*pow(base,pow-1);
        } else {
            return 1;
        }
    }

    static long power(long base, long pow) {
        if (pow == 0) return 1;

        long temp = power(base, pow/2);

        if (pow%2 == 1) return (temp*temp*base)%MOD;
        else return (temp*temp)%MOD;
    }
}
