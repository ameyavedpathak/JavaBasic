package Assignment2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class TimerServer1
{
	static int counter=0;
	public static void main(String[] args) throws Exception
	{
	    System.out.println("Server is started");
		ServerSocket ss=new ServerSocket(9923);
		System.out.println("Server is waiting for client request");

	    while(true){
	    	Socket soc=null;
	    	 try
            {
                // Incoming client requests
	    		 soc = ss.accept();
                counter++; 
                System.out.println("Client is connected");
                 
                // Getting input and out streams
                BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
                OutputStreamWriter os=new OutputStreamWriter(soc.getOutputStream());
                
                 
                System.out.println("New thread for client");

 
                // Thread is created
                Thread th = new ThreadC(soc);
             
                th.start();
                th.join();
                 
            }
            catch (Exception e){
            	soc.close();
                e.printStackTrace();
            }
	    }
	}
}
class ThreadC extends Thread{
	Socket s;
	static int clientno=0;
	ThreadC(Socket s){
		this.s=s;
	}
	public synchronized void run(){
		clientno++;
		Date d1 = new Date(); 				//Use of Date Class
		 
		System.out.println("Client "+clientno+" : Date: "+d1);
	}

}