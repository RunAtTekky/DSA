import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.println("Enter operator or x or X to quit");
            char oper = input.next().charAt(0);
            if (oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%'){
                System.out.println("Enter num1 and num2");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (oper == '+'){
                    ans = num1+num2;
                }
                if (oper == '-'){
                    ans = num1-num2;
                }
                if (oper == '*'){
                    ans = num1*num2;
                }
                if (oper == '/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                }
                if (oper == '%'){
                    ans = num1%num2;
                }

            } else if(oper == 'x' || oper == 'X'){
                System.out.println("Bye Bye");
                break;
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println(ans);
        }

    }
}
