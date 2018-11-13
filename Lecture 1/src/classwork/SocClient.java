package classwork;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		String ip = "localhost";
		int port = 9923;
		Socket s= new Socket(ip,port);
		int str = 6;
		 
		 OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		 PrintWriter out = new PrintWriter(os);
		 out.println(str);
		 //Forcefully sends data
		 out.flush();
	}

}
