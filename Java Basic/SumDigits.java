import java.util.Scanner;

class SumDigits{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number between 0 and 1000 :");	
		int x1 = scan.nextInt(); 										
		int S = 0;
		while(x1>0)
		{
		S = S + x1%10;
		x1 = x1/10; 
		}
		
		System.out.println("The Sum of the digit is "+S);
			}
		}