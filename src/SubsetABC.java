public class SubsetABC {
    public static void main(String[] args) {
        SubABC("", "abc");
    }

    static void SubABC(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);

        SubABC(p+ch, up.substring(1));
        SubABC(p, up.substring(1));
    }
}
