# TP8 - Sockets
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">Overview</a>
      <ul>
        <li><a href="#built-with">Technologies Used</a></li>
      </ul>
    </li>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li>Exercise 1</li>
        <li>Exercise 2</li>
      </ul>
    </li>
    <li>
      <a href="#">Implementation</a>
      <ul>
        <li><a href="#">Screenshots</a></li>
      </ul>
    </li>
   
    
  </ol>
</details>

## Overview
Sockets are a fundamental mechanism in network programming to establish communication between two machines or applications on a local or extended network (internet). A socket acts as an endpoint for sending or receiving data via network protocols, such as TCP (Transmission Control Protocol) or UDP (User Datagram Protocol).

### Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**

## About The Project
### Exercise 1: Number Guessing Game
This exercise consists of developing an interactive client-server game in Java, where several players try to guess a "magic number" generated randomly by the server. The server, which uses sockets for network communication, manages each player via a separate thread and provides clues ("bigger" or "smaller") to guide their attempts. Clients connect to the server, submit their assumptions, and receive real-time responses. The objective is to understand the concepts of network communication, thread management for competition, and manipulation of input/output flows in Java while designing a fun and interactive game.
#### Explanation
- ServerSocket serverSocket = new ServerSocket(4011); : Creates a server that listens on port 4011.
- Socket socket = serverSocket.accept(); : Accepts client connection.
- InputStream inputStream = socket.getInputStream(); and OutputStream outputStream = socket.getOutputStream(); Allows data to be received and sent.
- int randomNumber = (int) (Math.random() * 100); : Generates a random number between 0 and 99
- int guessNumber = inputStream.read(); : Reads the client attempt (the number guessed).
- Depending on the response, the server sends an index: outputStream.write(1) for "larger", outputStream.write(-1) for "smaller", and outputStream.write(0) for "correct".
### Exercise 2: File Manager Server
This exercise consists of creating a simple Java file server using sockets and threads to manage multiple clients simultaneously. The server listens on a specific port, accepts incoming connections, and creates a separate thread for each client. Clients can connect to the server, request a file by specifying its name, and receive its content if it exists. The objective is to learn how to use sockets for network communication, manage multiple connections through threads, and manipulate input/output flows to read and transmit data between server and clients.
#### Explanation
##### Server:
- ServerSocket serverSocket = new ServerSocket(PORT); : The server listens for incoming connections on the specified port.
- Socket socket = serverSocket.accept(); : Accepts a client connection and creates a socket for communication.
- new Thread(new ClientThread(socket)). start(); : Creates a thread for each client that connects and assigns an instance of ClientThread to manage the interaction.
##### Client: 
- Socket socket = new Socket(HOST, PORT); : Connects to the server using the specified address and port.
- BufferedReader bufferedReader = new BufferedReader(inputStreamReader); and PrintWriter printWriter = new PrintWriter(outputStream, true); Allows data to be read and written to the input and output stream of the socket.
- String line = bufferedReader.readLine(); : Reads messages sent by the server.
- System.out.print("Enter the filename to download: "); : Prompts the user to enter a file name for the download.
- printWriter.println(filename); : Sends the name of the chosen file to the server.
- interact(bufferedReader, consoleReader, printWriter); The method manages the interaction between client and server (display of available files, request for download, etc.).
##### ClientThread:
- Socket socket = new Socket(HOST, PORT); : The thread is created for a specific client that has been connected to the server.
- BufferedReader bufferedReader = new BufferedReader(inputStreamReader); and PrintWriter printWriter = new PrintWriter(outputStream, true); Manages data flows between the server and client.
- manageFiles(printWriter, bufferedReader); Manages the logic of displaying files available on the server and reading a file requested by the client.
- customLS(directory, printWriter); : Lists the files in the server directory.
- File file = new File(directory, filename); : Searches for a specific file on the server.
- FileReader fileReader = new FileReader(file); : Reads the file and sends it line by line to the client.
- printWriter.println("File not found"); : If the requested file does not exist, an error message is sent to the client.

## Implementation
  ### Screenshots:
  #### Exercise 1:
  ![image](https://github.com/user-attachments/assets/4813ef1a-9a7c-46a1-993f-5123281b7da9)
  ![image](https://github.com/user-attachments/assets/6835005a-8dac-4ddf-a935-e5632bc3ef4a)
  ![image](https://github.com/user-attachments/assets/80de7b33-904c-4a94-9a22-5f173f744245)
  ![image](https://github.com/user-attachments/assets/4f84e000-c654-43c4-b490-1369855f1dec)
  ![image](https://github.com/user-attachments/assets/2a76aa4d-bf2f-44e2-a720-5b843f1b2d77)
 #### Exercise 2:
 ![image](https://github.com/user-attachments/assets/bd72867d-58c7-43d9-8ab2-45c73af4fdff)
 ![image](https://github.com/user-attachments/assets/f207130a-1009-497f-98e0-f5a927b6d8a3)
 ![image](https://github.com/user-attachments/assets/4ab53b66-cca2-499e-878d-ef988b639055)
 ![image](https://github.com/user-attachments/assets/8ae78472-8e71-4976-8490-54a9339d504e)
 ![image](https://github.com/user-attachments/assets/26925697-d7e0-4c0d-ae45-191df9fd9478)







 

  


