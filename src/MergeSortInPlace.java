import java.util.Arrays;
public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] a = {2,7,9,10,12,8,5};
        mergeSortIP(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }

    // MergeSort with auxiliary space

    static void mergeSortIP(int[] arr, int s, int e) {
        if (e-s == 1) {
            return;
        }
        int mid = s + (e-s)/2;

        mergeSortIP(arr, s, mid);
        mergeSortIP(arr, mid, e);

        mergeIP(arr, s, mid, e);


    }

    static void mergeIP(int[] arr, int s, int m, int e) {
        int i=s, j=m, k=0;
        int[] res = new int[e-s];

        while (i<m && j< e) {
            if (arr[i] < arr[j]) {
                res[k] = arr[i];
                i++;
            } else {
                res[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i< m) {
            res[k] = arr[i];
            i++;
            k++;
        }

        while (j< e) {
            res[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < res.length; l++) {
            arr[s+l] = res[l];
        }
    }

}
