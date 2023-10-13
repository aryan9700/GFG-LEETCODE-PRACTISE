import java.util.ArrayList;

public class Diagonal {
    public static void main(String[] args) {
        System.out.println(Path("", 3, 3));
    }
    static ArrayList<String> Path(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList list=new ArrayList<>();
         if(r>1 && c>1){
           list.addAll(Path(p+"D", r-1, c-1));
        }
        if(r>1){
           list.addAll(Path(p+"V", r-1, c));
        }
        if(c>1){
            list.addAll(Path(p+"H", r, c-1));
        }
        return list;
    }}