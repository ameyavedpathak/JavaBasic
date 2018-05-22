import java.util.Scanner;

class Celsius2Fahrenheit{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Celsius");
		double C = scan.nextDouble();
		double F;	
		F = C*33.8;
		System.out.println(C+" Celsius is "+F+" Fahrenheit");
			}
		}	
