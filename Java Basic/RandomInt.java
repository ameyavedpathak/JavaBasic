import java.util.Scanner;

class RandomInt{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter the maximum positive number for random generation: ");	
		int maxNum = scan.nextInt(); 										
		
				//System.out.println(maxNum);
				double r = Math.random()*(maxNum + 1);
		System.out.println(r);
		System.out.println((int)r);
			}
		}