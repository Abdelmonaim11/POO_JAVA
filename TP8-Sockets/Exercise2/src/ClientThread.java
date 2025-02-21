import java.io.*;
import java.net.Socket;

public class ClientThread implements Runnable{
    private final Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream, true);
        ) {
            manageFiles(printWriter, bufferedReader);
        } catch (Exception e) {
            System.out.println("Error handling client: " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Couldn't close the socket: " + e.getMessage());
            }
        }
    }

    public void manageFiles(PrintWriter printWriter, BufferedReader bufferedReader) throws IOException {
        printWriter.println("-------------- FILE MANAGER SERVER -------------------");
        String path = "E:\\D\\Master_SDIA\\POO_JAVA\\POO_JAVA_TPS\\TP8-Sockets\\Exercise2\\files"; // Path to the file directory
        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            customLS(directory, printWriter);
        } else {
            System.out.println("Invalid directory");
        }

        printWriter.println("------------------------------------------------------");
        printWriter.println("Which file do you want to download?");
        String filename = bufferedReader.readLine();
        File file = new File(directory, filename);
        if (file.exists() && file.isFile()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader fileBufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = fileBufferedReader.readLine()) != null) {
                    printWriter.println(line);
                }
            }
        } else {
            printWriter.println("File not found");
        }
    }

    private static void customLS(File directory, PrintWriter printWriter) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                printWriter.println(decorate(file));
                if (file.isDirectory()) {
                    customLS(file, printWriter);
                }
            }
        }
    }

    private static String decorate(File file) {
        return file.getName() +
                (file.isDirectory() ? "      <DIR>    " : "      <FILE>    ") +
                (file.canRead() ? "      r" : "      -") +
                (file.canWrite() ? "w" : "-") +
                (file.isHidden() ? "h" : "-");
    }
}
