public class pattern {
    public static void main(String[] args) {
       printing(4, 0);
    }
    public static void printing(int r, int c){
        if(r==0){
            return ;
        }
        if(r>c){
            System.out.print("*");
            printing(r, c+1);
        }else{
            System.out.println();
            printing(r-1, 0);
        }
    }
}
