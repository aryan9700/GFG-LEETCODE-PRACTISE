public class count {
    public static void main(String[] args) {
     System.out.println(Count(30204,0));
    }
    public static int Count(int n, int ans){
        if(n==0){
            return ans ;
        }
        int rem=n%10;
        if(rem==0){
            return Count(n/10, ans+1);
        }else{
        return Count(n/10, ans);
    } 
}
}