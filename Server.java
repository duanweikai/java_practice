import java.io.IOException;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class Server {
    // 预定义字典
    private static final Map<String, String> dictionary;

    static {
        dictionary = new HashMap<>();
        dictionary.put("apple", "苹果");
        dictionary.put("pear", "梨");
    }

    public static final int PORT = 8888;   // 0 - 65535

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(PORT);
        while (true) {
            // 通过 socket 接收客户端（client）发送过来的数据——请求
            System.out.println(1);
            byte[] receiveBuffer = new byte[1024];
            System.out.println(2);
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            System.out.println(3);
            socket.receive(receivePacket);  // 方法会阻塞
            System.out.println(4);

            // 利用 DatagramPacket 可以拿到通信的元信息
            InetAddress address = receivePacket.getAddress();
            SocketAddress socketAddress = receivePacket.getSocketAddress();
            int port = receivePacket.getPort();
            int length = receivePacket.getLength();
            System.out.println(address);
            System.out.println(socketAddress);
            System.out.println(port);
            System.out.println(length);
            // 进行业务处理 —— 翻译
            // 通过 socket 发送数据 —— 响应
        }
    }
}
