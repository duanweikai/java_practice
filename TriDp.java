import java.util.Scanner;

public class TriDp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] arr=new int[n+1][n+1];
            for(int i=1;i<=n;i++){
                for (int j=1;j<=i;j++){
                    arr[i][j]=scanner.nextInt();
                }
            }
            System.out.println(getDp(arr, n));
        }
    }
    private static int getDp(int[][] arr, int n) {
        int[][] dp=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            dp[i][1]=dp[i-1][1]+arr[i][1];
        }
        int max=dp[1][1];
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;j++){
                dp[i][j]=Math.max(dp[i-1][j]+arr[i][j],dp[i-1][j-1]+arr[i][j]);
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }

}
