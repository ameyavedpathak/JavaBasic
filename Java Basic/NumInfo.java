import java.util.Scanner;

class NumInfo

 {

	public static void main(String[] args)
{
		System.out.println("Enter the positive integer number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		//System.out.println((isEven(num)) ? "The number is an even number." : "The number is an odd number.");
		//System.out.println((isPrime(num)) ? "The number is an Prime number." : "The number is not prime number." +printFactor(num));
		
		if(isEven(number))
		{
			System.out.println(number + "The number is Even Number");
		} else 
		{
			System.out.println(number + "The number is Odd Number");
		}
	
	if(isPrime(number))
		{
			System.out.println(number + "The number is Prime Number");
		} else 
		{
			System.out.println(number + "The number is not Prime Number");
			System.out.println("The factors are :");
			printFactors(number);
			System.out.println();
			System.out.println("The prime factor are: ");
			printPrimeFactors(number);
						
		}
	
	
	}
			
public static boolean isEven(int num)
		{
				if((num & 1) == 0) {
				return true;
			}
			if((num & 1) != 0) {
				return false;
			}
			return false;
		}	
public static boolean isPrime(int num) {
        for(int i = 2; i<= Math.sqrt(num);i++){
        if (num % i == 0 ){
            return false;
			}
		}
		return true;
		}
		
	
public static void printPrimeFactors(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if (num%i == 0)
				if (isPrime(i))
					
			System.out.println(i);
		}
	}
	
	public static void printFactors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if (num%i == 0)
			System.out.println(i);
		
		}
	}
}
	
	
	
