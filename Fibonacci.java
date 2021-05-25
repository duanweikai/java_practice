import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long[] arr=new long[100001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 100001; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1000000;
        }
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.printf(n<25?"%d\n":"%06d\n",arr[n]);
        }

    }

}
