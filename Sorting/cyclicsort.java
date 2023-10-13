import java.util.Arrays;

public class cyclicsort{
 public static void main(String[] args) {
     int[] arr = { 5, 4, 3, 2, 1 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
 }

private static void cyclicSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        while(arr[i]!=i+1){
            swap(arr, i, arr[i]-1);
        }
    }
}
private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

}
}