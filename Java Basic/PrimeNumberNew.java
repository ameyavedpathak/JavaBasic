package ClassWork;

public class PrimeNumberNew {

	   public static void main (String[] args)
	   {		
	       int i;
	       int num;
	       String  P = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     P = P + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers are... ");
	       System.out.println(P);
	   }
	} 

	

