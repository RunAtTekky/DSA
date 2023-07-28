import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,6,9,8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertion(int[] arr){
        // Going from 0 to second last element
        // We are actually going to sort till 'i+1'
        // Thus, we will be sorting from 1 to last element
        for(int i=0; i<=arr.length-2; i++){
            // We start from one more than i and keep checking if our element currently is smaller
            // than the previous element.
            // If it is smaller than swap the elements, else, break the loop as the list behind is already sorted
            for(int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
