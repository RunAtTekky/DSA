public class Patterns {
    public static void main(String[] args) {

//        pattern9(4);
//        pattern8(4);
//        pattern7(5);
//        pattern6(7);
//        pattern5(5);
//        pattern4(9);
//        pattern3(8);
//        pattern2(5);
//        pattern1(5);

    }
//    static void pattern1(int n) {
//        for (int rows=1; rows<=n; rows++) {
//            for (int cols=1; cols<=n; cols++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//    }
//    static void pattern2(int n) {
//        for(int rows=1; rows<=n; rows++) {
//            for (int cols=1; cols<=rows; cols++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//    }
//    static void pattern3(int n) {
//        for(int rows=1; rows<=n; rows++) {
//            for (int cols=1; cols<=n+1-rows; cols++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//    }
//    static void pattern4(int n) {
//        for(int rows=1; rows<=n; rows++) {
//            for (int cols=1; cols<=rows; cols++) {
//                System.out.print(cols + " ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern5(int n) {
//        for (int rows=1; rows<=2*n-1; rows++) {
//            // Both approach work
//            // Approach 1
////            int totalCols = rows>n ? 2*n - rows : rows;
////            for (int cols=1; cols<=totalCols; cols++) {
////                System.out.print("* ");
////            }
//            // Approach 2
//            for (int cols=1; cols<=(rows - (rows/n)*(rows-n)*2); cols++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//    static void pattern6(int n) {
//        for (int rows=1; rows<= 2*n-1; rows++) {
//            // for printing spaces
////            int numberOfSpaces = (n-rows) + (rows/n)*(n-rows)*(-2);
//            int numberOfSpaces = rows > n ? rows-n : n-rows;
//
//            for (int cols = 1; cols<=numberOfSpaces; cols++) {
//                System.out.print(" ");
//            }
//            // for printing stars
//            int numberOfStars = rows>n ? 2*n-rows : rows;
//            for (int cols=1; cols<=numberOfStars; cols++) {
//                System.out.print("* ");
//            }
//            // for printing spaces
//            for (int cols = 1; cols<=numberOfSpaces; cols++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//    }
//    static void pattern7(int n) {
//        for (int rows=1; rows<=n; rows++) {
//            int numberOfSpaces = 2*(n-rows);
//            // for printing spaces
//            for (int i=1; i<=numberOfSpaces; i++) {
//                System.out.print(" ");
//            }
//            // for printing the numbers
//            for(int cols = rows; cols>0; cols--) {
//                System.out.print(cols + " ");
//            }
//            for(int cols = 2; cols<=rows; cols++) {
//                System.out.print(cols + " ");
//            }
//
//
//
//            for (int i=1; i<=numberOfSpaces; i++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern8(int n) {
//        for (int rows = 1; rows<=2*n-1; rows++) {
//            // printing starting spaces
//            int numberOfSpaces = rows>n ? rows-n : n-rows;
//            for (int i=1; i<=numberOfSpaces; i++) {
//                System.out.print(" ");
//            }
//            // for printing the digits
//            int startFromDigit = rows>n ? 2*n-rows : rows;
//            for (int cols = startFromDigit; cols > 0; cols--) {
//                System.out.print(cols);
//            }
//            for (int cols = 2; cols <= startFromDigit; cols++) {
//                System.out.print(cols);
//            }
//
//            // printing end spaces
//            for (int i=1; i<=numberOfSpaces; i++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern9(int n) {
//        for(int rows = 0; rows< 2*n -1; rows++) {
//            for (int cols = 0; cols< 2*n -1; cols++) {
//                int atIndex = n - Math.min(Math.min(rows,cols), Math.min(2*n-2 -rows, 2*n-2 -cols));
//                System.out.print(atIndex + " ");
//            }
//            System.out.println();
//        }
//    }
}
