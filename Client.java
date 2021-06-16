import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        // 我们作为客户端，端口不重要
        // 我们不填，由 OS 自动分配一个目前没有被使用的 port
        DatagramSocket socket = new DatagramSocket();

        String request = "apple";
        // 网络中发送的数据全部是二进制的 byte[]
        // 对 char 做过字符集编码后的结果
        byte[] bytes = request.getBytes("UTF-8");

        // 先把要发送的数据包装成 DatagramPacket

        InetAddress localHost = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(
                bytes, 0, bytes.length,
                localHost, Server.PORT
        );
        socket.send(sendPacket);
    }
}
