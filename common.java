
import java.util.Scanner;

public class common {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        int min= Math.min(str2.length(), str1.length());
        String s="";
        int length=0;
        for(int i=0;i<min;i++){
            for(int j=i+1;j<=min;j++){
                if(str1.contains(str2.substring(i,j))&&j-i>length) {
                    length = j - i;
                    s = str2.substring(i, j);
                }
            }
        }
        System.out.println(s.length());
    }

}
//
//import java.util.*;
//public class common{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            String s1=sc.nextLine();
//            String s2=sc.nextLine();
//            String max=s1.length()>=s2.length()?s1:s2;
//            String min=s1.length()>=s2.length()?s2:s1;
//            int l=0;
//            String s="";
//            for (int i = 0; i < min.length(); i++) {
//                for (int j = i+1; j <= min.length(); j++) {
//                    if (max.contains(min.substring(i,j)) && j-i>l) {
//                        l=j-i;
//                        s=min.substring(i,j);
//                    }
//                }
//            }
//            System.out.println(s.length());
//        }
//        sc.close();
//    }
//}
