import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server{
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println("client connected");
        
    }
}