import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] mat = {
            {10,20,30,40},
            {11,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int t = 34;
        int[] ans = rowsAndColsSearch(mat, t);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rowsAndColsSearch(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;
        while(r<matrix.length && c>=0){
            if ( matrix[r][c] == target){
                return new int[]{r, c};
            }
            else if(matrix[r][c] > target){
                c--;
            }
            else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
