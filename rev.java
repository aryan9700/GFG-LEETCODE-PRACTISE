public class rev {
    public static void main(String[] args) {
        String str="GeeksForGeeks";
        
     
     System.out.println(rev(str));

    }
    static String rev(String str){
            String clr="";
        for(int i = str.length()-1; i >=0; i--) {
            clr+=str.charAt(i);
        }
        return clr;
       
    }}