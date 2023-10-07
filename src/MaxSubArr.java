import java.util.ArrayList;

public class MaxSubArr {
    public static void main(String[] args) {
        int[] nums = {-2,-1,3};
        int ans = maxArray(nums);
        System.out.println(ans);
    }

    static int maxArray(int[] nums) {
        int[] preSum = new int[nums.length+1];

        preSum[0] = 0;

        for (int i=1; i<preSum.length; i++) {
            preSum[i] = preSum[i-1] + nums[i-1];
        }

        int max_ind = 1;
        int max = preSum[1];
        for (int i=1; i<preSum.length; i++) {
            if (preSum[i] > max) {
                max_ind = i;
                max = preSum[i];
            }
        }
//        System.out.println(max);

        int maxDiff = preSum[max_ind] - preSum[0];

        int i=0;
        while (i<max_ind) {
            if (preSum[max_ind] - preSum[i] > maxDiff) {
                maxDiff = preSum[max_ind] - preSum[i];
            }
            i++;
        }

        while (i< preSum.length-1) {
            int diff = preSum[preSum.length - 1] - preSum[i];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            i++;
        }
        return maxDiff;



    }
}
