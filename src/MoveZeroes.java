import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZero(nums);
        System.out.println("Hey");
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZero(int[] nums) {
        int i=0;
        while (i<nums.length-1) {
            int k = 0;
            while (k<nums.length && nums[i] == 0) {
                // move each element back once
                for (int j=i+1; j<nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                // now insert 0 at back
                nums[nums.length-1] = 0;
                k++;
            }
            i++;
        }
    }
}
