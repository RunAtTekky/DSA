public class Pattern132 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans = findPattern(arr);
        System.out.println(ans);
    }

    private static boolean findPattern(int[] arr) {
        for (int i=0; i<arr.length-2; i++) {
            for (int j=i+1; j<arr.length-1; j++) {
                for (int k=j+1; k<arr.length; k++) {
                    if (arr[i] < arr[k] && arr[j] > arr[k]) return true;
                }
            }
        }
        return false;
    }
}
