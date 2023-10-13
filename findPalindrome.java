public class findPalindrome {

    public static void main(String[] args) {
        int arr[]={12321,222,333,444,555};
     System.out.println( palinArray(arr, 5));
    }

    public static int palinArray(int[] a, int n){
     {
    for (int i = 0; i < a.length; i++) {
        String s = Integer.toString(a[i]);
     for (int j = 0; j < s.length()/2; j++) {
        char start = s.charAt(j);
        char end = s.charAt(s.length() - 1 - j);
     
     if(start!=end){
        return -1;
     }
}
}
    return 0
    ;}

}}