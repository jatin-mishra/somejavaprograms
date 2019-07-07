package first;

import java.io.*;
import java.net.*;

public class client{

public static void main(String[] args) {
try {
Socket s = new Socket("localhost",9991);

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
String str1="";
String str2="";

while(str1 != "stop" && str2 != "stop") {
str1= (String)dis.readUTF();
//	str1 == "stop" ? System.out.println():System.out.println(str1);
System.out.println(str1);
str2 = br.readLine();
dos.writeUTF(str2);

}


} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

}