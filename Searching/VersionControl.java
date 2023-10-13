
public class VersionControl {
public static void main(String[] args) {
    int n=5;
    int bad=4;
   System.out.print(firstBadVersion(n));
}
public static boolean isBadVersion(int n, int bad){
    for (int i = 0; i < n; i++) {
    if(i==bad){
        return true;
    }}
    return false;      
}
public int firstBadVersion(int n) {
    for (int i = 1; i < n/2; i++) {
    if(isBadVersion(i)==true){
        return i;
    }
}
}}
