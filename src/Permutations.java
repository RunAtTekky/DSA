import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String p = "";
        String up = "abc";

//        permutation(p,up);

        ArrayList<String> res = permutationArr(p,up);
        System.out.println(res);

        int cnt = permutationCount(p,up);
        System.out.println(cnt);
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i=0; i<=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> permutationArr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i=0; i<=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationArr(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for (int i=0; i<=p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count + permutationCount(f+ch+s, up.substring(1));
        }
        return count;
    }
}
