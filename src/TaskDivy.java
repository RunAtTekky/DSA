import java.util.Scanner;

public class TaskDivy {
    public static void main(String[] args) {
        int[] arr = {15, 22, 18, 36, 42, 19};

        Scanner input = new Scanner(System.in);
        int key = input.nextInt();

        System.out.println(search(arr, key));
        display(arr);

        set(arr, 0, 17);
        display(arr);

        System.out.println(get(arr, 3));

    }

    static boolean search(int[] arr, int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    static void display(int[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void set(int[] arr, int i, int key){
        arr[i] = key;
    }

    static int get(int[] arr, int i){
        return arr[i];
    }
}
