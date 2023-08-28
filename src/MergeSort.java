import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {2,7,9,10,12,8,5};
        int[] ans = mergeSort(a);
        System.out.println(Arrays.toString(ans));
    }

    // MergeSort with auxiliary space

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort((Arrays.copyOfRange(arr, mid, arr.length)));

        return merge(left, right);


    }

    static int[] merge(int[] first, int[] second) {
        int i=0, j=0, k=0;
        int[] res = new int[first.length + second.length];

        while (i<first.length && j< second.length) {
            if (first[i] < second[j]) {
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }

        while (i< first.length) {
            res[k] = first[i];
            i++;
            k++;
        }

        while (j< second.length) {
            res[k] = second[j];
            j++;
            k++;
        }
        return res;
    }

}
