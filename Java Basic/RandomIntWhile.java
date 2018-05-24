package ClassWork;

import java.util.Scanner;

public class RandomIntWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int maxNum=1;
		while(maxNum!=0)
		{
			System.out.println("Enter the maximum positive number for random generation(0 to quit): ");	
			 maxNum = scan.nextInt(); 										
			double r = (maxNum+1)* Math.random();
			System.out.println(r);
			System.out.println((int)r);	
					
		}
		
	}

}
