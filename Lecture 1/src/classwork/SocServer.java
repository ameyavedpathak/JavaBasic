package classwork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Server is Stared");
		ServerSocket ss = new ServerSocket(9923);
				
		System.out.println("Server is waiting for client request");
		Socket s = ss.accept();
		
		System.out.println("Client Connected");	
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		int square = (a*a);
		
		System.out.println("Client Data :" +square);
		
	}

}
