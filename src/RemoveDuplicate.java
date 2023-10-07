import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {8,7,1,10,17,15,18,11,16,9,19,12,5,14,3,4,2,13,18,18};

//        Arrays.sort(nums);
        int ans = findDuplicate(nums);
        System.out.println(ans);




    }
    static int findDuplicate(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != i+1) {
                return nums[i];
            }
        }
        return 0;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
