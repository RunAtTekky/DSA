import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
//        Running the loop (n-1) times, as we only need to put n-1 elements at the back
//        Last element will be at its own place
        for(int i = 0; i<arr.length-1; i++){
            swapped = false;
//            Here we are checking from index 1 to the unsorted index
//            After each iteration the list is sorted at the last index, thus we do not need to check that.
//            First we check till the last and then we decrease.
//            i.e. first length-i, when i=0;
//            then 'i' increases and length-i, decreases one by one.
            for(int j = 1; j<arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
