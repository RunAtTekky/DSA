import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int f = input.nextInt();

        int count = 0;
        while(n!=0){
            if (n%10 == f){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
