import java.io.*;
import java.net.*;


public class Main
{
  public static void main (String[]args) throws Exception
  {

    InetAddress ip = InetAddress.getByName ("www.javatpoint.com");
      System.out.println ("Hostname : " + ip.getHostName ());
      System.out.println ("IP address : " + ip.getHostAddress ());

  }
}