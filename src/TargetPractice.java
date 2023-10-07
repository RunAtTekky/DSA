import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int cnt = count();
            System.out.println(cnt);
        }
        in.close();

    }

    static int count() {
        int score = 0;
        Scanner ing = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String line = ing.nextLine();
            for (int j = 0; j < 10; j++) {
                if (line.charAt(j) == 'X') {
                    score += Math.min(Math.min(i+1,j+1),Math.min(10-i,10-j));
                }
            }
        }
        ing.close();
        return score;
    }
}
