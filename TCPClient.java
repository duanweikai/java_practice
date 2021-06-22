import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println(1);
        scanner.nextLine();
        Socket socket = new Socket("121.5.171.14", 8080);
        System.out.println(2);
        scanner.nextLine();
    }
}
