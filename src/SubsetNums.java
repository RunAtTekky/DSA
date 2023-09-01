import java.util.ArrayList;
import java.util.List;

public class SubsetNums {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetNums(arr);
        for (List<Integer> l : ans) {
            System.out.println(l);
        }

    }

    static List<List<Integer>> subsetNums(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>(); // We create an outer loop
        outer.add(new ArrayList<>()); // adding an empty list to it


        int start = 0;
        int end = 0;

        for (int j = 0; j<arr.length; j++) {
            int n = outer.size(); // taking size of current outer loop
            start = 0;
            if (j>0 && arr[j] == arr[j-1]) {
                start = end+1;
            }
            end = outer.size()-1;

            for (int i=start; i<n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // for the i'th list in outer we get that list
                inner.add(arr[j]); // now we add to that list
                outer.add(inner); // we now add that to the final outer list
            }
        }
        return outer;
    }
}
