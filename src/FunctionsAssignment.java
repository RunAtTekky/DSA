import java.util.ArrayList;
import java.util.Scanner;

public class FunctionsAssignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Q.14
//        int n = in.nextInt();
//        System.out.println(sumN(n));



//        Q.13
//        int start = in.nextInt();
//        int end = in.nextInt();
//        System.out.println(primeBetween(start, end));


//        Q.12
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println(isTriplet(a,b,c));

//        Q.10
//        int n = in.nextInt();
//        int[] arr = intToArray(n);
//        System.out.println(isPalindrome(arr));



//        Q.9
//        int n = in.nextInt();
//        System.out.println(factorial(n));


//        Q.8
//        int marks = in.nextInt();
//        System.out.println(grade(marks));


//        Q.7
//        int n = in.nextInt();
//        System.out.println(isPrime(n));


//        Q.6
//        int r = in.nextInt();
//        System.out.println(circum(r));
//        System.out.println(area(r));


//        Q.5
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(product(a,b));


//        Q.4
//        int first = in.nextInt();
//        int second = in.nextInt();
//        System.out.println(sum(first,second));


//        Q.3
//        int n = in.nextInt();
//        System.out.println(canVote(n));


//        Q.2
//        int n = in.nextInt();
//        System.out.println(isEven(n));
//        if(isEven(n)){
//            System.out.println("The number is EVEN");
//        }
//        else{
//            System.out.println("The number is ODD");
//        }


//        Q. 1
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println(maxNum(a,b,c));
//        System.out.println(minNum(a,b,c));


    }
/*
Above is main function
----------------------------------------
----------------------------------------
----------------------------------------
Below are functions
 */



//    Q.14
//    Write a function that returns the sum of first n natural numbers.
//    static int sumN(int n){
//        int sum = 0;
//        for(int i=1; i<=n; i++){
//            sum += i;
//        }
//        return sum;
//    }



//    Q.13
//    Write a function that returns all prime numbers between two given numbers.
//    static ArrayList<Integer> primeBetween(int start, int end){
//        int[] primesBw = primes(end);
//        ArrayList<Integer> res = new ArrayList<Integer>(1);
//        for(int i=start+1; i<end; i++){
//            if (primesBw[i]!=0){
//                res.add(i);
//            }
//        }
//        return res;
//    }
//    static int[] primes(int n){
//        int[] res = new int[n+1];
//        res[0] = 0;
//        res[1] = 0;
////        All numbers are potentially primes
//        for(int i=2; i<n+1; i++){
//            res[i] = 1;
//        }
//        for(int p = 2; p*p <=n; p++)
//        {
//            // If prime[p] is not changed, then it is a prime
//            if(res[p] == 1)
//            {
//                // Update all multiples of p
//                for(int i = p*p; i <= n; i += p)
//                    res[i] = 0;
//            }
//        }
//        return res;
//    }



//    Q.12
//    Write a function to check if a given triplet is a Pythagorean triplet or not.
//    static boolean isTriplet(int a, int b, int c){
//        if (a*a + b*b == c*c){
//            return true;
//        }
//        else if (a*a + c*c == b*b){
//            return true;
//        }
//        else if (c*c + b*b == a*a){
//            return true;
//        }
//        else{
//            return false;
//        }
//
//    }



//    Q.10
//    Write a function to find if a number is a palindrome or not. Take number as parameter.
//    static boolean isPalindrome(int[] arr){
//        int s = 0;
//        int e = arr.length-1;
//        while(s<e){
//            if (arr[s]!=arr[e]){
//                return false;
//            }
//            s++;
//            e--;
//        }
//        return true;
//    }
//    static int[] intToArray(int n){
//        int s = size(n);
//        int[] res = new int[s];
//        int i=0;
//        while(n>0){
//            int rem = 0;
//            rem = n%10;
//            res[i] = rem;
//            n = n/10;
//            i++;
//        }
//
//        return res;
//    }
//    static int size(int n){
//        int count = 0;
//        while(n>0){
//            count++;
//            n = n/10;
//        }
//        return count;
//    }



//    Q.9
//    Write a program to print the factorial of a number by defining a method named 'Factorial'.
//    static int factorial(int n){
//        int res = 1;
//        for (int i = 2; i <= n ; i++) {
//            res *= i;
//        }
//        return res;
//    }


//    Q.8
//    Write a program that will ask the user to enter his/her marks (out of 100).
//    Define a method that will display grades according to the marks entered as below:
    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
//    static String grade(int m){
//        if (m>=91 && m<=100){
//            return "AA";
//        }
//        else if(m>=81 && m<=90){
//            return "AB";
//        }
//        else if(m>=71 && m<=80){
//            return "BB";
//        }
//        else if(m>=61 && m<=70){
//            return "BC";
//        }
//        else if(m>=51 && m<=60){
//            return "CD";
//        }
//        else if(m>=41 && m<=50){
//            return "DD";
//        }
//        else{
//            return "Fail";
//        }

    }

//    Q.7
//Define a method to find out if a number is prime or not.
//    static boolean isPrime(int number){
//        int i=2;
//        while(i*i<number){
//            if(number%i==0){
//                return false;
//            }
//            i++;
//        }
//        return true;
//    }


//    Q.6
//    Write a program to print the circumference and area
//    of a circle of radius entered by user by defining your own method.
//    static double circum(int radius){
//        return 2*3.14*radius;
//    }
//    static double area(int radius){
//        return 3.14*radius*radius;
//    }


//    Q.5
//    Define a method that returns the product of two numbers entered by user.
//    static int product(int m, int n){
//        return m*n;
//    }


//    Q.4
//    Write a program to print the sum of two numbers entered by user by defining your own method.
//    static int sum(int a, int b){
//        return a+b;
//    }

//    Q.3
//    A person is eligible to vote if his/her age is
//    greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
//    static boolean canVote(int age){
//        return age >= 18;
//
//    }


//    Q.2
//    Define a program to find out whether a given number is even or odd.
//    static boolean isEven(int n){
//        return n % 2 == 0;
//    }



//    Q.1
//    Define two methods to print the maximum and the minimum number
//    respectively among three numbers entered by the user.
//    static int maxNum(int a, int b, int c){
//        if (b>a){
//            if (b>c){
//                return b;
//            }
//            else{
//                return c;
//            }
//        }
//        if (c>a){
//            return c;
//        }
//        else{
//            return a;
//        }
//    }
//    static int minNum(int a, int b, int c){
//        if (b<a){
//            if(b<c){
//                return b;
//            }
//            else{
//                return c;
//            }
//        }
//        if (c<a){
//            return c;
//        }
//        else{
//            return a;
//        }
//    }
//}
