public class duplicate {
     public static void main(String[] args) {
       int[] nums = {1,3,4,2,2};
       System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
              if(nums[i]!=i+1){
                    
                
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
               return nums[i];
            }
        }else i++;}
            
        
        return 0;
        
     }
     private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    
    }
}
