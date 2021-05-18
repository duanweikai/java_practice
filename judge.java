//import java.util.Scanner;
//
//public class judge {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while(scanner.hasNext()){
//            double n=scanner.nextDouble();
//            double r=scanner.nextDouble();
//            if(n>r*3.14*2){
//                System.out.println("Yes");
//            }
//            else {
//                System.out.println("No");
//            }
//        }
//    }
//}

import java.math.BigDecimal;
import java.util.Scanner;
public class judge{
    public static void main(String[] args) {
        BigDecimal m,n,l,pi;
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            m=scanner.nextBigDecimal();
            n=scanner.nextBigDecimal();
            pi=new BigDecimal("3.14");
            l=((new BigDecimal("2")).multiply(pi)).multiply(n);
            if(l.compareTo(m) > 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}
