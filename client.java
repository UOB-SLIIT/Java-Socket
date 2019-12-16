import java.io.IOException;
import java.net.Socket;

public class client{
    public static void main(String[] args)throws IOException{
        Socket s = new Socket("localhost",4999); //port(4999) replace the "localhost" with the server ip if you are using 2 pcs

    }
}
