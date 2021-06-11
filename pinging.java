import java.util.Scanner;

public class pinging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            System.out.println(judge(s1, s2));
        }

    }

    private static boolean judge(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars1[i] == chars2[j]) {
                } else return false;
            }
        }
        return true;
    }
}