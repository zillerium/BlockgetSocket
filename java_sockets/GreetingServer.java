// File Name GreetingServer.java
import java.net.*;
import java.io.*;

public class GreetingServer extends Thread {
   private ServerSocket serverSocket;
   
   public GreetingServer(int port) throws IOException {
      serverSocket = new ServerSocket(port);
//      serverSocket.setSoTimeout(10000);
   }

   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " + 
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(server.getInputStream());
           
	     int length = in.readInt();
           // System.out.println(in.readUTF());
            byte[] message = new byte[length];

	    if(length>0) {
   		in.readFully(message, 0, message.length); // read the message
	    }
              OutputStream os1 = new FileOutputStream("./termsout2.pdf");

                // Starts writing the bytes in it
                os1.write(message);
                System.out.println("Successfully done");

                // Close the file
                os1.close();


            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
               + "\nGoodbye!");
            server.close();
            
         } catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
         } catch (IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String [] args) {
      int port = Integer.parseInt(args[0]);
      try {
         Thread t = new GreetingServer(port);
         t.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
