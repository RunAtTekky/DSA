import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (num/mid == mid && num%mid==0){
                return true;
            }
            else if (num/mid < mid){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return false;
    }
}
