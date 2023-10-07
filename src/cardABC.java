import java.util.Scanner;

public class cardABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            String cards = in.next();
            if (canSort(cards)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }

    }

    static boolean canSort(String cards) {
        if (cards.length() == 0) return false;
        int notInPlace = 0;
        if (cards.charAt(0) != 'a') notInPlace++;
        if (cards.charAt(1) != 'b') notInPlace++;
        if (cards.charAt(2) != 'c') notInPlace++;
        if (notInPlace == 3) return false;
        return true;
    }
}
