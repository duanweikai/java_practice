import java.util.Scanner;

public class poke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            while (t > 0) {
                t--;
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] arr=new int[2*n];
                int[] temp=new int[2*n];
                for(int i=0;i<2*n;i++){
                    arr[i]=scanner.nextInt();
                }
                while(k>0){
                    temp=wash(arr,n);
                    k--;

                }
                for (int i=0;i<2*n;i++) {
                    if(i==2*n-1){
                        System.out.print(temp[i]);
                        break;
                    }
                    System.out.print(temp[i]+" ");
                }
            }
        }


    }

    private static int[] wash(int[] arr, int n) {
        int[] res=new int[2*n];
        int temp=0;
        for(int i=0;i<n;i++){
            res[temp++]=arr[i];
            res[temp++]=arr[i+n];
        }
        return res;
    }
}
