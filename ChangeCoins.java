
import java.util.Arrays;

public class ChangeCoins {
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int amount=11;
        System.out.println(change(arr, amount));
        //System.out.println(change2(arr, amount));
    }
//
//    private static int change2(int[] coins, int amount) {
//        int[] dp=new int[amount+1];
//        dp[0]=0;
//        Arrays.fill(dp,amount+1);
//        for(int i=1;i>=amount;i++){
//            for (int coin : coins) {
//                if (coin <= i) {
//                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//                }
//            }
//        }
//
//        return dp[amount]>amount?-1:dp[amount] ;
//    }


    private static int change(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];

    }



}
