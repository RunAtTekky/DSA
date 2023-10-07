public class colourNeighbour {
    public static void main(String[] args) {
        String arr = "AAAABBAABBBB";

        boolean ans = winner(arr);

        System.out.println(ans);
    }

    private static boolean winner(String arr) {
        if (arr.length()<3) return false;
        int sam = 0;
        int alice = 0;
        for (int i = 1; i < arr.length()-1; i++) {
            char a = arr.charAt(i-1);
            char b = arr.charAt(i);
            char c = arr.charAt(i+1);

            if (a == b && b == c) {
                if (b == 'A') {
                    alice++;
                } else sam++;
            }
        }
        return alice>sam;
    }
}
