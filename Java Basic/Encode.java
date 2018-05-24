package ClassWork;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String msg = "This is a test";
String enmsg = "";
String decmsg = "";
int key = 22;
System.out.println("Original Message: ");
System.out.println(msg);

for(int i=0; i<msg.length(); i++)
// Encode message
	enmsg = enmsg +(char) (msg.charAt(i) ^ key);
	System.out.println("Encode message: ");
	System.out.println(enmsg);
// Decode message
	for(int i =0; i<msg.length(); i++)
		decmsg = decmsg + (char) (enmsg.charAt(i) ^ key);
	
	System.out.println("Decoded message: ");
	System.out.println(decmsg);
		
	
	}

}
