import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaltonStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            System.out.println(function());
            t--;
        }
    }
    static void swap(List<Integer> pos, int i, int j) {
        int temp = pos.get(i);
        pos.add(i,pos.get(j));
        pos.add(j,temp);
    }
    static int function() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> pos = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int p = in.nextInt();
            pos.add(p);
        }
        int count = 0;
        int i=1;
        while(i<n) {
            int correct = pos.get(i)-1;
            if (i==correct) {
                swap(pos,i,i-1);
                count++;
            } else {
                i++;
            }
        }
        return count;
    }
}
