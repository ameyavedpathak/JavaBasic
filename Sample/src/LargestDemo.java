
public class LargestDemo {

public static int largestAmongThree(int a, int b, int c){
	
	if(a>=b && a>=c) return a;
	else if(b>=a && b>=c) return b;
	else if (c>=a && c>=b) return c;
	
	return 0;
	
	
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("largest is " +largestAmongThree(4,2,5));
			System.out.println("largest is " +largestAmongThree(5,3,5));
		
		
	}

}
