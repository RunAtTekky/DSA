import java.util.ArrayList;
import java.util.List;

public class backtracking {
    public static void main(String[] args) {
        // Number of paths
        System.out.println(count(3,3));

        // Paths
        printPath("", 3,3);

        // Path in list
        ArrayList<String> res = printPathArr("", 3,3);
        System.out.println(res);

        // Diagonal is also allowed
        ArrayList<String> res1 = printPathDiagArr("", 3,3);
        System.out.println(res1);
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);

        return left + right;
    }
    static void printPath(String p, int r, int c) {
        if (r == 1 || c == 1) {
            System.out.println(p);
            return;
        }
        printPath(p+"D", r-1,c);
        printPath(p+"R", r,c-1);
    }
    static ArrayList<String> printPathArr(String p, int r, int c) {
        if (r == 1 || c == 1) {
            ArrayList<String> path = new ArrayList<>();
            path.add(p);
            return path;
        }
        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(printPathArr(p+"D", r-1,c));
        ans.addAll(printPathArr(p+"R", r,c-1));
        return ans;
    }

    static ArrayList<String> printPathDiagArr(String p, int r, int c) {
        if (r == 1 || c == 1) {
            ArrayList<String> path = new ArrayList<>();
            path.add(p);
            return path;
        }
        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(printPathDiagArr(p+"D", r-1,c));
        ans.addAll(printPathDiagArr(p+"D", r-1,c-1));
        ans.addAll(printPathDiagArr(p+"R", r,c-1));
        return ans;
    }



}
