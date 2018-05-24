package ClassWork;

public class VarArgs {

	static void veTest(int ...v) {
	System.out.println("Number of args:" +v.length);
	System.out.println("Contents: ");
	for(int i=0; i<v.length; i++)
		System.out.println("  agrs"+i+": "+v[i]);
		System.out.println();

	}
	
	public static void main(String[] args){
		veTest(10);
		veTest(1,2,3);
		veTest();
		veTest(1,2,3,10,12,(int)1.2);
		
	}

}
