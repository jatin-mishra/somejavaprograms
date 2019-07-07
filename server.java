package first;

import java.io.*;
import java.net.*;

public class server{

public static void main(String[] args) {
try {
System.out.println("waiting for client......");
ServerSocket ss = new ServerSocket(9991);
Socket s = ss.accept();
System.out.println("got a friend .....");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
String str1="";
String str2="";


while(str1 != "stop" ) {
str1 = br.readLine();
dos.writeUTF(str1);

str2= (String)dis.readUTF();
//	str1 == "stop" ? System.out.println():System.out.println(str1);
System.out.println(str2);

}


} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

}

