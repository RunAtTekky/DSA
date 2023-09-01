import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
//        char[] s = {'h','e','a','t'};
//        revS(s,0);
//        System.out.println(s);

        boolean ans = powOfTwo(1073741825, 1);
        System.out.println(ans);

    }
    static void revS(char[] s, int p) {
        if (p >= (s.length/2)) {
            return;
        }

        char temp = s[p];
        s[p] = s[s.length-1-p];
        s[s.length-1-p] = temp;

        revS(s, p+1);
    }
    static boolean powOfTwo(int n, int pows) {
        if (pows == n) {
            return true;
        }
        if (pows > n || Math.abs(pows-n) < pows) {
            return false;
        }
        return powOfTwo(n, pows*2);
    }
}
