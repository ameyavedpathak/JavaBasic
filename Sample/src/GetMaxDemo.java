
public class GetMaxDemo {

	public static int getMax(int[] values) {
		int max = values[0];
		for(int i =0; i<values.length; i++) {
			if(values[i]>max) {
				max = values[i];
				}
			} 
		
		return max;
	}	
	public static void main(String[] agrs){
		
		System.out.println("The max values is "+getMax(new int [] {1,5,-2,10}));
		System.out.println("The max values is "+getMax(new int [] {1,5,-2,10}));
		System.out.println("The max values is "+getMax(new int [] {1,5,-2,10}));
	}
	
}


		