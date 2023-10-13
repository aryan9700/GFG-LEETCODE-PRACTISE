class SpecialNo {
    public static void main(String[] args) {
        int arr[]={2,3,6};
        int val=countSpecialNumbers(3, arr);
        System.out.println(val);
    }
    public static int countSpecialNumbers(int N, int arr[]) {
        int max=-1;
        for(int n:arr){
            max=Math.max(max,n);
        }
        int[]  hash =new int[max+1];
        int len=hash.length;
        for(int i=0; i<N; i++){
            int start=arr[i];
            if(hash[start]<=1){
                for(int j=start; j<len; j=j+start){
                    hash[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0; i<N; i++){
            if(hash[arr[i]] >1) 
            ans++;
            
        }
            return ans;
        }
    }