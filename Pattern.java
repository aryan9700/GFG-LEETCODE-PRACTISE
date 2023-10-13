public class Pattern{
    public static void main(String[] args) {
       pattern7(4);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 0; row <= 2*n; row++) {
            int c=row>n ? 2*n-row : row;
            for (int col = 0; col < c ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
            for (int row = 1; row <= n; row++) {
                int spaces=n-row;
                for (int s = 1; s <= spaces; s++) {
                    System.out.print(" ");
                }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
            for (int row = 1; row < 2*n; row++) {
                int spaces=row> n ? row-n: n-row;
                for (int s = 1; s <= spaces; s++) {
                    System.out.print(" ");
                }
                int c=row>n? 2*n-row: row;
            for (int col = 1; col <= c ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
            for (int row = 1; row <= n; row++) {
                int spaces=n-row;
                for (int s = 1; s <= spaces; s++) {
                    System.out.print(" ");
                }
            for (int col = row ; col >= 1 ; col--) {
                System.out.print(col);
            }
            
            for (int col = 2 ; col <= row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
       int originalN =n;
        n=2*n-2;
           for (int row = 0; row<= n; row++) {
           for (int col = 0; col <= n; col++) {
            
           int val=originalN-Math.min(Math.min(row, col), Math.min(n-row,n-col));
            System.out.print(val+" ");
           }
           System.out.println();
        }
    }}
        

