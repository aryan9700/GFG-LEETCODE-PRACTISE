import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
         int[] arr = {4,0,2,1};
         System.out.println(missing(arr));
        
 }
 public static int missing(int[] arr){
        int i=0;
        
        while(i<arr.length){
            if(arr[i]>arr.length-1){
                i++;
            }
            else if(arr[i]!=i){
                swap(arr, i, arr[i]);
            }
        }

    return i;
 }
 private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

}
    }

