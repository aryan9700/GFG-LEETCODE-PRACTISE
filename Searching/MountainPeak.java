public class MountainPeak {
    public static void main(String[] args) {
        int[] arr={3,5,3,2,0};
       System.out.println(binarySearch(arr));
    }
    public static int binarySearch(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end || start > end) {
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;      
            }  
            else if(arr[mid-1]>arr[mid] && arr[mid-1]!=0){
                end=mid-1;            
            }
            else{
                return mid ;
            }       
        }
        return -1;
    }

}
