// package name;
// import name.*;
import java.io.*;
import java.util.*;
// import 

public class first{
    public static void main(String[] args){
   Collection cl = new ArrayList();
      cl.add(3);
      cl.add(4);

      Iterator i = cl.iterator();
       int j;
      for(j=0;j<2;j++){
          System.out.println(i.next());
      }
   
    }

}


