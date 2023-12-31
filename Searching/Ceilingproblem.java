public class Ceilingproblem{
    public static void main(String[] args) {
        int nums[]={2,3,5,9,14,16,18};
        int target=17;
        System.out.println(searchInsert(nums, target));

    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
               
            }
            return start ; 
        }
              
    }