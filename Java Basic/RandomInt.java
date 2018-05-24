package ClassWork;
import java.util.Scanner;
public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the maximum positive number for random generation: ");	
		int maxNum = scan.nextInt(); 										
		double r = Math.random();
		System.out.println(r);
		System.out.println((int)r);
	}

}