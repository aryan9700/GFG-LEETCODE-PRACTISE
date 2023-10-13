public class sortedArrayCheck{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,14,12};
        int i=0;
       System.out.println(sortedArrayCheck(arr, i));
        
    }

    private static boolean sortedArrayCheck(int[] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sortedArrayCheck(arr, i+1);
    }
}