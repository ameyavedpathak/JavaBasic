package classwork;

class Hi extends Thread {

		
public void run()
	{
		for(int i=0;i<=4;i++)
		{		
			try
			{
				System.out.println("Hi");
				Thread.sleep(1000);
			} 
			catch(Exception e)
			{
							
			}
		}	
	}
}
			
class Hello extends Thread {

public void run()
	{
		for(int j=0;j<=4;j++)
		{				
			try
			{
				System.out.println("Hello");
				Thread.sleep(1000);
								
			} 
			catch(Exception e)
			{
				}
			
		}
		
		
	}
}

public class MultiThreading {
	
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try
		{
			
			Hello obj1 = new Hello();
			Hi obj2 = new Hi();
			
			obj1.start();
			Thread.sleep(100);
			obj2.start();
		}
		
		catch(Exception e)
		{
				System.out.println(e);
		}
	}
}
