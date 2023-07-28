public class CodeForces {
    public static void main(String[] args) {
        int n = 1804289382;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (sumOfN(mid,n)){
                ans = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    static boolean sumOfN(long n, long target){
        long sum = (n*(n+1))/2;
        return sum<=target;
    }
}
