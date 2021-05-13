import java.util.Scanner;

public class Level {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                if(a>=arr[i]){
                    a=a+arr[i];
                }
                else {
                    a+=fun(a,arr[i]);
                }
            }
            System.out.println(a);
        }

    }

    private static int fun(int a, int b) {
        while(b>0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }

}
