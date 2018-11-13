package classwork;

class Hi1 implements Runnable {

		
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
			
class Hello1 implements Runnable {

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

public class ThreadInterface {
	
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try
		{
			
			Thread t1 = new Thread(new Hi());
			Thread t2 = new Thread(new Hello());
			
			t1.start();
			Thread.sleep(100);
			t2.start();
		}
		
		catch(Exception e)
		{
				System.out.println(e);
		}
	}
}
