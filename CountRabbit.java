import java.util.Scanner;

public class CountRabbit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            System.out.println(countRabbit(x));
        }
    }

    private static int countRabbit(int x) {
        if(x==1||x==2){
            return 1;
        }
        return countRabbit(x-1)+countRabbit(x-2);
    }
}
