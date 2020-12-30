import java.util.Scanner;

public class count1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            int count=0;
            for(int i=0;i<32;i++){
                if((a&1<<i)!=0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
