public class binaysearch {
    public static void main(String[] args) {
        int nums[]={1,2,3,5,7,8};
        int target=8;
       System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target){
        return binarySearch(nums, target, 0, nums.length);

    }
    public static int binarySearch(int[] nums, int target,int start,int end){
        
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(target<nums[mid]){
            return binarySearch(nums, target, start, mid-1);
        }
            return binarySearch(nums, target, mid+1, end);
        
    }
}
