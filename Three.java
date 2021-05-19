//import java.util.Scanner;
//
//public class Three {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        while(scanner.hasNext()){
//            int a=scanner.nextInt();
//            int b=scanner.nextInt();
//            int c=scanner.nextInt();
//            if((a+b>c)&&(a+c>b)&&(b+c>a)){
//                if((Math.abs(a-b)<c)&&(Math.abs(a-c)<b)&&(Math.abs(b-c)<a)){
//                    System.out.println("Yes");
//                }
//            }
//            else System.out.println("No");
//
//        }
//    }
//}
import java.math.BigInteger;
import java.util.*;

public class Three{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            BigInteger a=scanner.nextBigInteger();
            BigInteger b=scanner.nextBigInteger();
            BigInteger c=scanner.nextBigInteger();
            if(a.add(b).compareTo(c)>0 && a.add(c).compareTo(b)>0 && b.add(c).compareTo(a)>0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
