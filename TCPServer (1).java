package sample1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        while (true) {
            Socket s = ss.accept();
            s.close();
        }
    }
}
