class Power
{
public static void main(String[]args) throws java.io.IOException
	{
	int e;
	int result;
		for(int i=0;i< 10;i++)
		{
			result =1;
			e=i;
			
			/*while(e>0)
			{
			result *=2;
			e--;
			} */
			
			for(e=i;e>0;e--) result *=2;
			System.out.println("2 to the " +i + " power is "+result);
		
	}

}

}


