import java.util.Arrays;

public class substringsum{
    public static void main(String[] args) {
        int[] array={1,2,3,6,5}; 
        Arrays.sort(array);
        for(int num: array){
   
        System.out.println(num);
        }
         System.out.println(missingNumber(array, 5));
    } 
    static int missingNumber(int num[], int n) {
        // Your Code Here
        int k=0;
        for (int i = 0; i < num.length; i++) {
            num[i]=k;
           for (int k = 0; k < num.length; j++) {
            
           }
        }


}}
