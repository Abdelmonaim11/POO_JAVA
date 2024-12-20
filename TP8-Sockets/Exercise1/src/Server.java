import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4011);
        System.out.println("The server is using port 4011.");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected ....");
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        int randomNumber = (int) (Math.random() * 100);
        while (true) {
            int guessNumber = inputStream.read();
            System.out.println("Player guessed: " + guessNumber);

            if (guessNumber == randomNumber) {
                outputStream.write(0);
                System.out.println("Congratulations, you guessed the number✅✅✅");
                break;
            } else if (guessNumber < randomNumber) {
                outputStream.write(1);
                System.out.println("Go Higher 🔺🔺🔺");
            } else {
                outputStream.write(-1);
                System.out.println("Go Lower 🔻🔻🔻");
            }
        }
        System.out.println("Server is closing ...");
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
