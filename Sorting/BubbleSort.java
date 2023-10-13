import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubblesort(arr);
      System.out.println(Arrays.toString(arr));  
      }

    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);   
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;

    }

}
