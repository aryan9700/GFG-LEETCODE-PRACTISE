public class RBS{
    public static void main(String arg[]){
        int arr[]={5,6,7,8,1,2,3,4};
       System.out.println( rotated(arr,3,0,arr.length-1));
    }
    private static int rotated(int[] arr,int target, int s,int e){
        if(s>e){
            return -1;
        }
       int m=s+(e-s)/2;
       if(arr[m]==target){
        return m;
       }
       if(arr[s]<=arr[m]){
        if(target>=arr[s] && target <=arr[m]){
            return rotated(arr, target, s, m-1);
        }
        else{
            return rotated(arr, target, m+1, e);
        }}
       else {
        if(target<=arr[s] && target>=arr[m]){
            return rotated(arr, target, m+1, e);
        }else{
            return rotated(arr, target, s, m-1);
        }
       }
       }
        
    }
