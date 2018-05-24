package ClassWork;

public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[]={"This", "is", "a", "test."};
		
		System.out.println("Orignal arrays: ");
		for(String s : strs)
				System.out.println(s+ " ");
		System.out.println("\n");
	
		strs[1] = "was";
		strs[3] = "test, too!";
		
		System.out.println("Modified array: ");
		
		for(String s : strs)
			
		System.out.println(s +" ");
	}

}
