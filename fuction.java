public class fuction {
    public static long pow(int x, int y){
        long ans=1;
        for(int i=0;i<y;i++){
            ans*=x;
        }
        return ans;
    }
    public static boolean isNarcissus(int n){
        int sum=0;
        int m=n;
        while(n!=0) {
            int a = n % 10;
            n=n/10;
            sum+=pow(a,3);
        }
        return sum == m;
    }
    public static void main(String[] args) {
        //System.out.println(pow(2,3));
        System.out.println(isNarcissus(153));
    }
}
