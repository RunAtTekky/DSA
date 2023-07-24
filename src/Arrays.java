import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] aoo = new int[5];
        for (int i = 0; i < aoo.length; i++) {
            aoo[i] = in.nextInt();

        }
        for(int i:aoo){
            System.out.print(i + " ");
        }
    }

}
