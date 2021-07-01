package sample1;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    Socket socket = new Socket("182.254.132.183", 8080);
                    TimeUnit.SECONDS.sleep(5);
                    socket.close();
                    System.out.println("关闭连接");
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }).start();
        }

        TimeUnit.HOURS.sleep(1);
    }
}
