import java.util.Scanner;

class FeetInch2Cm{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter height in feet and inch");
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int I;
		double C;
		I = (x1*12)+x2;
		C = I*2.54;
		System.out.println("It is "+C+" cm");
			}
		}