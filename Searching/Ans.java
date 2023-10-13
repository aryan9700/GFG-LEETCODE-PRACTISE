import java.util.Arrays;

public class Ans {
    public static void main(String[] args) {
        int[] nums = {5,6,7,7,7,8,8,10};
        int target = 7;
        int[] ans=searchRange(nums,target);
       System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target){
        int[] ans={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(start <= end) {
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                BinarySearch(nums,target,start,mid-1);
                
            }
            if(nums[mid]<=target){
                BinarySearch(nums,target,mid+1,end);           
            }         
        }
        return ans;
    }
    public static void BinarySearch(int[] nums, int target,int start, int end){
    while(start <= end) {
        int mid=start + (end-start)/2;
        if(nums[mid]>=target){
            end=mid-1;
            
        }
        if(nums[mid]<=target){
            start=mid+1;
        }     
    }}}