import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 4011);
        System.out.println("Connected to server ...");
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number between 0 and 100: ");
            int guess = scanner.nextInt();

            outputStream.write(guess);
            int response = inputStream.read();

            if( response == 0) {
                System.out.println("Congratulations, you guessed the number ✅✅✅");
                break;
            } else if (response == 1) {
                System.out.println("Go Higher 🔺🔺🔺");
            } else {
                System.out.println("Go Lower 🔻🔻🔻");
            }
        }
    }
}
