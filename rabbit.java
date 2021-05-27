import java.math.BigInteger;
import java.util.Scanner;

public class rabbit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger[] bigIntegers=new BigInteger[91];
        bigIntegers[0]=new BigInteger("1");
        bigIntegers[1]=new BigInteger("1");
        for(int i=2;i<=90;i++){
            bigIntegers[i]=bigIntegers[i-1].add(bigIntegers[i-2]);
        }
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(bigIntegers[n]);
        }
    }
}
