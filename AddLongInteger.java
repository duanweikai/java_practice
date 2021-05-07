//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String s1=scanner.nextLine();
//        String s2=scanner.nextLine();
//        String string1=reserve(s1);
//        String string2=reserve(s2);
//        int length=Math.min(s1.length(),s2.length());
////        for(int i=0;i<length;i++){
////            string=string1.charAt(i)+string2.charAt(i);
////        }
//    }
//
//    private static String reserve(String s1) {
//        int length=s1.length();
//        StringBuilder s= new StringBuilder();
//        for(int i=length-1;i>=0;i--){
//            char temp=s1.charAt(i);
//            s.append(temp);
//        }
//        return s.toString();
//    }
//}


import java.util.Scanner;

public class AddLongInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(addLongInteger(s1, s2));
        }
    }

    private static String addLongInteger(String s1, String s2) {
        StringBuilder stringBuilder=new StringBuilder();
        int i =s1.length()-1;
        int j=s2.length()-1;
        int flag=0;
        while(i>=0||j>=0||flag!=0){
            int sum=flag;
            if(i>=0){
                sum+=s1.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=s2.charAt(j--)-'0';
            }
            stringBuilder.append(sum%10);
            flag=sum/10;
        }

        return stringBuilder.reverse().toString();
    }
}
