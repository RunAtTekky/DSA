public class longestChainString {
    public static void main(String[] args) {
        String[] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
        int ans = longestStrChain(words);
        System.out.println(ans);
    }


    static int longestStrChain(String[] words) {
        int count = 1;
        sort(words);
        String curr = words[0];
        for (int i=1; i<words.length; i++) {
            if (words[i].length() == curr.length() + 1) {
                if(isSubstring(curr, words[i])) {
                    count++;
                    curr = words[i];
                }
            }
        }
        return count;
    }
    static boolean isSubstring(String a, String b) {
        int i=0;
        int j=0;
        while (i<a.length() && j<b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }
        if (i == a.length()) return true;
        return false;
    }
    static void sort(String[] words) {
        for (int i=0; i<words.length; i++) {
            boolean swapped = false;
            for (int j=i+1; j<words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    swap(words, i, j);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }
    static void swap(String[] words, int i, int j) {
        String temp = words[i];
        words[i] = words[j];
        words [j] = temp;
    }
}
