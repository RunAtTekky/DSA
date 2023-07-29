import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    // This is another way of doing the cyclic sort
    static void cyclicSort(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int correct = arr[i]-1; // Correct position for the current value
            if (arr[i] != arr[correct]) { // We check if the value at current index and the correct index are same
                swap(arr, i, correct); // If they are not equal then swap
            } else {
                i++; // Else the value is at correct position so move to next position
            }
        }
    }


//    static void cyclicSort(int[] arr) {
//        int i=0;
//        while(i< arr.length) {
//            while (arr[i]!=i+1){
//                int temp = arr[i];
//                arr[i] = arr[temp-1];
//                arr[temp-1] = temp;
//
//            }
//            i++;
//        }
//    }

}
