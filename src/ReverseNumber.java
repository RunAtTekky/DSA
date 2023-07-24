import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int reverse = 0;
        while(n>0){
            reverse = reverse*10 + (n%10);
            n = n/10;
        }
        System.out.println(reverse);

    }
}
