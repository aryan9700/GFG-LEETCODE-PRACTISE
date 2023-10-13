import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,-1}};
        int target=7;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
           
}

    private static int[] search( int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return null;
    }
    private static int max( int[][] arr) {
        int max=Integer.MIN_VALUE;
        for (int[] ints:arr) {
            for (int anInt : ints) {
                if(anInt>max){
                    max=anInt;
                }
            }
        }
        return max;
    }

}