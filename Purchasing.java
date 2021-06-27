import java.util.Arrays;
import java.util.Scanner;

public class Purchasing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            arr[i]+=scanner.nextInt()*2;
        }
        System.out.println(Arrays.toString(arr));
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    }



}
