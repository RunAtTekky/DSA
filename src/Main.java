import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int n = input.nextInt();

        for (int i = 2; i <=n ; i++) {
            int temp = b;
            b = a+b;
            a = temp;

        }
        System.out.println("Your fibonnaci number is " + b);
    }
}