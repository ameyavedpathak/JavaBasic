import java.util.Scanner;

class RandomIntRangeWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max = 1;
			
		while(min!=max) {
			System.out.println("Enter the maximum positive number for random generation(same numbers to quit): ");	
			max = scan.nextInt();
			min = scan.nextInt();			 
			double r = (Math.random() * (max - min + 1)) +min;
			//System.out.println(r);
			System.out.println((int)r);	
					
		} 
		
	}

}