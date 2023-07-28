public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 5;
        int pivot = findPivot(nums);
        System.out.println(findPivot(nums) + " <---- This is the index of pivot.");

        int firstHalf = bSearch(nums, target, 0, pivot);
        if (firstHalf!=-1){
            System.out.println(firstHalf);
        }
        else{
            System.out.println(bSearch(nums, target, pivot+1, nums.length-1));
        }
        System.out.println("^");
        System.out.println("This is the index of the target");
    }
    static int bSearch(int[] s, int target, int start, int end){
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
    static int findPivot(int[] nums){
        int s = 0;
        int e = nums.length-1;

        while(s<e){
            int mid = s + (e-s)/2;
            if (nums[mid] > nums[s]){
                s = mid;
            }
            else if (nums[mid] < nums[s]){
                e = mid-1;
            }
            else if (nums[mid] < nums[e]){
                s = mid+1;
            }
            else if (nums[mid] > nums[e]){
                e = mid-1;
            }
        }
        return s;
    }
}
