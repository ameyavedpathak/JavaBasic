import java.util.Scanner;

class hypot{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z;
		
		z = Math.sqrt(x*x+y*y);
		System.out.printf("x%.1f, y=%.1f, z=%.1f\n", x,y,z);
		
}
}