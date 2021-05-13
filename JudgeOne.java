
import java.util.Scanner;

public class JudgeOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String string = scanner.nextLine();
            boolean flag = false;
            for (int i = 0; i < string.length(); i++) {
                char temp = string.charAt(i);
                if (string.indexOf(temp) == string.lastIndexOf(temp)) {
                    System.out.println(temp);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }


}
