//package ClassWork;
//
//public class recursionDemo {
//
//	static int factorial(int n){
//		System.out.println("Factorial:" +n);
//		if (n==1) return 1;
//		int res = n * factorial(n-1);
//		System.out.println("res: "+res);
//		//return n * factorial(n-1);
//		return res;
//	}
//	
//	static int fib(int n){
//	System.out.println("Fib: "+n);
//	if(n<3) return 1;
//	return fib(n-1) + fib(n-2);
//	
//	static int sumUpto(int n) {
//		
//		if(n==1) return 1;
//		return n + sumUpto(n-1);
////		int sum = 0; 
////		for (int i = 1; i <= n; i++)
////			sum+= i; 
////		return sum;
//			
//	}
//	
//	static int sumFromTo(int a, int b) {
//		
//		//sum from a to b inclusively
//		if(a>b) return 0;
//		return a +sumFromTo(a+1,b);
//////		if(n==1) return 1;
////		return sumUpto(b)-sumUpto(a-1);
////		int sum = 0; 
////		for (int i = a; i <= b; i++)
////			sum+= i; 
////		return sum;
//		
//	}
//		
//	}
////	public void printAlphabetsTo(char ch){
////		//Print 'A' to ch
////		//\for example, printAlphabetsTo('c') will print "ABC"
////		
////	}
//	
//	private static int sumFromTo(int i, int b) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private static int sumUpto(int i) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	static char printAlphabetsToIteratively(char ch) {
//		for (char alphabet = 'A'; alphabet < ch; alphabet++) {
//		    System.out.print(alphabet);
//		}
//		return ch;
//	}
//
//	
//	static void printAlphabetsTo(char ch){			
//		if(ch == 'A'){
//			System.out.print(ch);
//		}
//		else{ 
//			 printAlphabetsTo((char)(ch - 1));
//			 System.out.print((char)(ch));
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(factorial(4));
//		System.out.println(fib(4));
//		System.out.println(sumFromTo(3,4));
//		System.out.println(printAlphabetsToIteratively('S'));
//		printAlphabetsTo('M');
//	}
//
//}
