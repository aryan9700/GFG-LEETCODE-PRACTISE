public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,8,9};
       System.out.println( search(arr,9,0));
    }

    private static int search(int[] arr, int target, int i) {
        if(i>=arr.length){
            return 0;
        }
        else if(arr[i]==target ){
            return i;
        }
    return search(arr, target, i+1);
}}