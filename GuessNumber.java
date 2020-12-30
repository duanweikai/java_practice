import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int level = selectLevel();
        int range = getRandomRange(level);
        int random = generateRandom(range);
        int toGuessCount = getToGuessCount(level);

        playGame(random, toGuessCount);
    }

    public static int selectLevel() {
        Scanner sca = new Scanner(System.in);
        System.out.print("请选择难度:");
        return sca.nextInt();
    }

    private static void playGame(int random, int toGuessCount) {
        Scanner sca = new Scanner(System.in);

        int count = 0;
        System.out.print("请输入一个数字：");
        while (sca.hasNextInt() && count < toGuessCount) {
            int n = sca.nextInt();
            count++;
            if (n == random) {
                System.out.println("成功");
                return;
            } else if (n < random) {
                System.out.println("猜小了，还有 " + (toGuessCount - count) + "次机会");
            } else {
                System.out.println("猜大了，还有 " + (toGuessCount - count) + "次机会");
            }
        }
    }

    private static int getToGuessCount(int level) {
        switch (level) {
            case 1:
                return 7;
            case 2:
                return 5;
            default:
                return 10;
        }
    }

    private static int generateRandom(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

    private static int getRandomRange(int level) {
        switch (level) {
            case 1:
                return 100;
            case 2:
                return 1000;
            default:
                return 10;
        }
    }


}
