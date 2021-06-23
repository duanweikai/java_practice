import java.util.Scanner;
public class hanoiGame {
    static int times;
    public static void main(String[] args) {
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.println("汉诺塔游戏开始啦");
        System.out.println("请输入盘子数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //调用汉诺塔
        hannoi(n, A, B, C);
        s.close();
    }
    public static void move(int disk, char M, char N ){
        System.out.println("第"+(++times)+"次移动, 盘子"+disk+ "  "+M+"------->"+N);
    }
    public static void hannoi(int n, char A, char B, char C){
        if(n == 1){
            move(n, A, C);
        }else{
            //移动上一关的步骤移动到B
            hannoi(n - 1, A, C, B);
            //把最大的盘子移动C塔
            move(n, A, C);
            //再把B上的上一关的盘子移动到C上就可以了
            hannoi(n - 1, B, A, C);

        }
    }
}
