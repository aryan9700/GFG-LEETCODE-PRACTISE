import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,8,9};
       System.out.println((search(arr,5,0,new ArrayList<>())));
    }

    private static ArrayList<Integer> search(int[] arr, int target, int i,ArrayList<Integer> list) {
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target ){
           list.add(i);
        }
    return search(arr, target, i+1,list);
}}

