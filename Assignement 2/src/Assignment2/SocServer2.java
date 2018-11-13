package Assignment2;
import java.net.*;
import java.io.*;

import java.util.*;
class MultiThread extends Thread{
   public void run(){
      try{
         ServerSocket  ss=new ServerSocket(1234);
         while(true){
            Socket s=ss.accept();
            Date d1=new Date();
            System.out.println("Client Connected");        
            
            
            System.out.println(d1.toString());

         }
      }catch(Exception e){

      }
   }
}
public class SocServer2{
   public static void main(String[] args) {
      MultiThread xa=new MultiThread();
      xa.start();
   }
}