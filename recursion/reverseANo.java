public class reverseANo {
    public static void main(String[] args) {
      System.out.println(reverse(-1245));
    }
     static int ans = 0;
    public static int reverse(int x) {
        
        if(x%10 == 0) {
            return ans;
        }
        
        if (x > 0 || x < 0) {
            int temp = x % 10;
            ans = ans * 10 + temp;  
            reverse(x / 10);
        }
        return ans;
    }
}
