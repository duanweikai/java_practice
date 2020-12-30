import java.util.Scanner;

public class count2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < 32; i += 2) {
                if ((a & 1 << i) != 0) {
                    count1++;
                }
            }
            for (int i = 1; i < 32; i += 2) {
                if ((a & 1 << i) != 0) {
                    count2++;
                }
            }
            System.out.print("奇数位为1的个数为：");
            System.out.println(count1);
            System.out.print("偶数位为1的个数为：");
            System.out.println(count2);
        }
    }
}
