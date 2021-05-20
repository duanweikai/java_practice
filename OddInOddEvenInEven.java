import java.util.Arrays;
import java.util.Scanner;

public class OddInOddEvenInEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            if (n == 0)
                break;
            long a = (long) Math.pow(5, n);
            long b = (long) Math.pow(4, n);
            System.out.println((a - 4) + " " + (b - 4 + n));

        }
    }

    public static void oddInOddEvenInEven(int[] arr) {
        for(int i=0,j=1; (i<arr.length && j< arr.length) ; )
        {
            if(arr[arr.length-1]%2==0)
            {

                int temp=arr[arr.length-1];
                arr[arr.length-1]=arr[i];
                arr[i]=temp;
                i+=2;
            }
            else
            {
                int temp=arr[arr.length-1];
                arr[arr.length-1]=arr[j];
                arr[j]=temp;
                j+=2;
            }
        }
    }

}
