public class coins_target {
    public static void main(String[] args) {
        int[] coins={1,2,3};
        int target=4;
        System.out.println(change(coins, target));
    }

    private static int change(int[] coins, int target) {
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] += dp[i - coin];
                }
            }
        }
        return dp[target];
    }
}
