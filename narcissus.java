public class narcissus {
    public static void main(String[] args) {
        for(int i=100;i<=1000;i++){
            int n=i;
            int sum=0;
            while(n!=0){
                int d=n%10;
                n=n/10;
                sum+=(d*d*d);
            }
            if(sum==i){
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
