import java.util.ArrayList;
import java.util.List;

public class phonepad {
    public static void main(String[] args) {
      System.out.println(  letterCombinations("9"));
    }public static List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            List<String> list=new ArrayList<>();
            return list;
        }
        return pad("",digits);
    }
    static ArrayList<String> pad(String p, String up){
        
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'1';
        ArrayList<String> ans=new ArrayList<>();
        if(digit!=6 && digit!=8 && digit!=7){
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch=(char)('a'+ i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }}
        else if(digit==7){
            for (int i = (digit-1)*3+1; i <= digit*3; i++) {
            char ch=(char)('a'+ i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }
        }
        else if(digit==6){
            for (int i = (digit-1)*3; i <= digit*3; i++) {
            char ch=(char)('a'+ i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }
        }
        else {for (int i = (digit-1)*3+1; i <= digit*3+1; i++) {
            char ch=(char)('a'+ i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }}
        return ans;
    }
}