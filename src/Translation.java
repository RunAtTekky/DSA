import java.util.Scanner;
// CodeForces Question
public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String f = in.nextLine();
        String s = in.nextLine();
        if (f.length() != s.length()) {
            System.out.println("NO");
            return;
        }
        if (isRev(f,s)) {
            System.out.println("YES");
        } else System.out.println("NO");


    }
    static boolean isRev(String f, String s) {
        int l = f.length()-1;
        for (int i=0; i<f.length(); i++) {
            int index = l-i;
            if (f.charAt(i) != s.charAt(index)) {
                return false;
            }
        }
        return true;
    }
}
