import java.util.Arrays;

public class rotateAnArray {
    public static void main(String[] args) {
        int[] arr={1,2};
        int n=2;
        rotate(arr,n);
            }
    public  static void rotate(int arr[], int n)
    { 
        if(n==0 || n==1){
            System.out.println(arr[0]);
        }else{
        System.out.print(arr[n-1]);
        for (int i=0; i <n-1; i++) {
           System.out.print(arr[i]);
        }
    }
    }}

