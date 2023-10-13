public class Wealthleetcode {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
       System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
       for (int row = 0; row < accounts.length; row++) {
        int wealth=0;
        for (int col = 0; col < accounts[row].length; col++) {
            int money=accounts[row][col];
            wealth=money+wealth;
        }
        if(wealth>=max){
            max=wealth;
        }
       }
        return max;      
        }
    }