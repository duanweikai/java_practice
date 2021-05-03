
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            scanner.nextLine();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=scanner.nextInt();
            }
            int flag = 0;
            int count = 1;// 统计能够划分的数组的个数
            for (int i = 1; i < n; i++) {
                if (nums[i] > nums[i - 1]) {// 递增情况：flag==1表示递增，不做任何动作
                    if (flag == 0) {
                        flag = 1;
                    }

                    if (flag == -1) {// 由递减变递增，count加1
                        flag = 0;
                        count++;
                    }
                } else if (nums[i] < nums[i - 1]) {// 递减情况：flag==-1，表示递减，不做任何动作
                    if (flag == 0) {
                        flag = -1;
                    }

                    if (flag == 1) {// 此时有递增变递减，需要count加1
                        flag = 0;
                        count++;
                    }
                }
            }
            System.out.println(count);

        }

    }
}



//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String string = scanner.nextLine();
//            StringBuilder re = new StringBuilder();
//            String[] words = string.split(" ");
//            for (int i = words.length - 1; i >= 0; i--) {
//                re.append(words[i]);
//                if (i != 0) {
//                    re.append(" ");
//                }
//            }
//            System.out.println(re);
//        }
//    }
//}
//    public static String reverse(String str) {
//        if (str == null || str.trim().equals("")) {
//            return str;
//        }
//        StringBuilder re = new StringBuilder();
//        String[] words = str.split(" ");
//        for (int length = words.length, i = length - 1; i >= 0; i--) {
//            re.append(words[i]);
//            if (i != 0) {
//                re.append(" ");
//            }
//        }
//        return re.toString();
//    }




