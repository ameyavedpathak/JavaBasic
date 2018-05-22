public class WakeMeUp
{
public static void main(String[]args) throws java.io.IOException
	{
			System.out.print("Wake me up when by pressing 'A'");
		while((char)System.in.read()!='A');
			System.out.print("Thank You Prince");
	}

}