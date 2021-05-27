//import java.util.Scanner;
//
//public class contains {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int n = scanner.nextInt();
//            StringBuffer stringBuffer = new StringBuffer();
//            for (int i = n; i >= 0; i--) {
//                String string = scanner.nextLine();
//                if (!string.contains(",")) {
//                    stringBuffer.append(string);
//                } else {
//                    stringBuffer.append("\"");
//                    stringBuffer.append(string);
//                    stringBuffer.append("\"");
//                }
//                if (n != 1) {
//                    stringBuffer.insert(stringBuffer.length(), ",");
//                }
//
//            }
//
//            System.out.println(stringBuffer);
//        }
//    }
//}

import java.util.*;
public class contains{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            scanner.nextLine();
            ArrayList<String> arrayList=new ArrayList<String>();
            for(int i=0;i<n;i++){
                String name=scanner.nextLine();
                if(name.contains(" ")||name.contains(",")){
                    arrayList.add("\""+name+"\"");
                }else{
                    arrayList.add(name);
                }
            }
            for(int i=0;i<n-1;i++){
                System.out.print(arrayList.get(i)+", ");
            }
            System.out.println(arrayList.get(n-1));
        }
    }
}

