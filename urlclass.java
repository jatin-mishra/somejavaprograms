import java.io.*;
import java.net.*;

public class urlclass{
   public static void main(String[] args){

      System.out.println("Hello World");
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String x = bf.readLine();

     URL url = new URL(x);
     System.out.println("protocol is : "+url.getProtocol());
     System.out.println("port name is  : "+url.getPort());
     System.out.println("host name  : "+url.getHost());
     System.out.println("file is  : "+url.getFile());

   }



}