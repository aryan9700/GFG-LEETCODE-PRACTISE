import java.util.ArrayList;

class PickIndexNo {
    public static void main(String[] args) {
       int arr[]={1, 335, 501, 170, 725, 479, 359, 963, 465, 706, 146, 12, 828, 962, 492, 996, 943, 828, 437, 392, 605, 903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539, 870, 913, 668, 300, 36, 895, 704, 812, 323};

           System.out.println( valueEqualToIndex(arr, 42));
    }
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer>  list=new ArrayList<>();
     for (int i = 0; i < n; i++) { 
        if(arr[i]==i+1){        
            list.add(i+1);
        }
    }
    return list;
}}