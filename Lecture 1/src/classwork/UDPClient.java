package classwork;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPClient{
	public static void main(String[] args) throws Exception
	{

		DatagramSocket ds=new DatagramSocket();

		int i=8;
		byte[] b=String.valueOf(i).getBytes();	//convert integer into byte
		InetAddress ia=InetAddress.getLocalHost();
		DatagramPacket dp= new DatagramPacket(b,b.length,ia,9999);                 //accept in byte array format
		ds.send(dp);

		byte[] b1=new byte[1024];
		DatagramPacket dp1=new DatagramPacket(b1,b1.length);
		ds.receive(dp1);
		String str=new String(dp1.getData(),0,dp1.getLength());
		System.out.println(str);

	}
}