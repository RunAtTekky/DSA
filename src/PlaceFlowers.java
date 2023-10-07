public class PlaceFlowers {
    public static void main(String[] args) {
        int[] f = {0,1,0};
        int n = 1;
        boolean ans = canPlaceFlowers(f,n);
        System.out.println(ans);
    }
    public static boolean canPlaceFlowers(int[] f, int n) {
        if (f.length == 1 && n==1 && f[0] == 0) return true;
        int posGaps = 0;
        int currDist = 0;

        int j=0;
        while (f[j] != 1) {
            currDist++;
            j++;
        }
        posGaps += currDist/2;
        currDist = 0;

        int k = j;
        for (int i=k; i<f.length; i++) {
            if (f[i] == 0) currDist++;
            else if (currDist != 0 && f[i] == 1){
                if (currDist%2 == 0) posGaps += currDist/2 - 1;
                else posGaps += currDist/2;
                currDist = 0;
            }
        }
        posGaps += currDist/2;
        if (posGaps >= n) return true;
        return false;
    }
}
