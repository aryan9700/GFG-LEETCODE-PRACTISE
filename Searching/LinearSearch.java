public class LinearSearch{
    public static void main(String[] args) {
        int arr[]={18,12,9,14,77,50};
        // int num=-1  ;
        // int ans=findIndex2(arr, num);
        // System.out.print(ans);
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]<min){
            min=arr[i];
           } 
        }
        return min;
    }

    public static boolean find(int arr[],int num) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int findIndexValue(int arr[], int num){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        
    }return -1;
}
    public static int findIndex2(int arr[], int num){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==num){
                return element;
            }
        }return Integer.MAX_VALUE;
    }
}