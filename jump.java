import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(jumpFloorII(n));

    }
    public static int jumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        int sum=0;
        for(int i=0;i<target;i++){
            sum+=jumpFloorII(i);
        }
        return sum;

    }
}
