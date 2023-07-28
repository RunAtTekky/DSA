import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {-2,-5,-3,-1,6,0,3};
        selSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int last = arr.length-i-1;
            int maxInd = getMaxInd(arr, last);
            swap(arr, maxInd, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxInd(int[] arr, int end){
        int max = 0;
        for(int i=0; i<=end; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
