import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombSumIV {
    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        int target = 7;
        Arrays.sort(nums);
        int ans = count(nums, target, 0);
        System.out.println(ans);
    }

    static int count(int[] nums, int target, int sum) {
        if (sum == target) return 1;

        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= target) {
                cnt += count(nums, target, sum+nums[i]);
            }
            else {
                break;
            }
        }
        return cnt;
    }
}
