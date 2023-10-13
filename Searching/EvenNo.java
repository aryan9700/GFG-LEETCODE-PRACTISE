public class EvenNo {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(digit2(nums[i])%2==0){
             count++;
           }
           
            // int digits=0;
            // int value=nums[i];
            // while(value!=0){    
            //     value=value/10;
            //     digits++;
            // }
            // if(digits%2==0){
            //     count++;
            // }           
        }
        return count;
        
    }
    public static int digit2(int value) {
        if(value<0){
            value=value*-1;
        }
        return(int)(Math.log10(value)+1);
    }
}
