import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] searchSpace = {0,1,2,3,4,5,6,7,8,9,10};
        int ans = bSearch(searchSpace, target);

        System.out.println("index: " + ans);
        System.out.println("value: " + searchSpace[ans]);

    }
    static int bSearch(int[] s, int target){
        int start = 0;
        int end = s.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if (s[mid] == target){
                return mid;
            }
            if (s[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
