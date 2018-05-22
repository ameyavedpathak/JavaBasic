import java.util.Scanner;

class RandomIntWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int maxNum=1;
		
		do {
			System.out.println("Enter the maximum positive number for random generation(0 to quit): ");	
			 maxNum = scan.nextInt(); 										
			double r = (maxNum+1)* Math.random();
			//System.out.println(r);
			System.out.println((int)r);	
					
		} while(maxNum!=0)
		
	}

}