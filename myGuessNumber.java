import java.util.Random;
import java.util.Scanner;

public class myGuessNumber {
    public static void main(String[] args) {
        int level= sectLevel();
        int range=getRandomRange(level);
        int toGuessCount=getToGuessNumber(level);
        int random=generateRandom(range);
        playGame( random,toGuessCount);
    }

    private static void playGame(int random, int toGuessCount) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你猜的数字");
        int count=0;
        while(sc.hasNextInt()&&count<toGuessCount){
            int n=sc.nextInt();
            count++;
            if(n==random){
                System.out.println("Good");
                return;
            }
            else if(n<random){
                System.out.println("猜小了，你还有"+(toGuessCount-count)+"次机会");
            }
            else{
                System.out.println("猜大了，你还有"+(toGuessCount-count)+"次机会");
            }

        }
    }

    private static int getToGuessNumber(int level) {
        switch (level){
            case 1:
                return 8;
            case 2:
                return 5;
            default:
                return 3;
        }

    }

    private static int generateRandom(int range) {
        Random random=new Random();
        return random.nextInt(range);
    }

    private static int getRandomRange(int level) {
        switch(level){
            case 1:
                return 100;
            case 2:
                return 1000;
            default:
                return 10;
        }

    }

    private static int sectLevel() {
        Scanner sc=new Scanner(System.in);
        System.out.print("请选择难度");
        return sc.nextInt();
    }
}
