class Example 
{
	static int abs(int n)
		
		{
			if(n>=0) return n;
			return -n;
		}
public static void main(String[] args){
		/*System.out.println("Ladies first ");
		System.out.println("What's up Guys!");
		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println(5%2);
		System.out.println(2*6/3/2.0);*/
		
		/*int a= 2, b= 3, c=4;
		System.out.println(a+b+c);
		System.out.println("a+b+c" +a+b+c);
		System.out.println("a*b=" +a*b);
		a += b + c/2;
		System.out.println("a=" +a);*/
		
		/*System.out.println("Hi\tWorld\nWhat's up");
		System.out.println("He said \"I like you\"");
		System.out.println("C:\\user\\ipark\\");
		System.out.println("sqrt("+9+") = "+Math.sqrt(9)); */
		
		/*char ch='A';
		for(;ch<'G';ch+=2)
		System.out.print(ch);
		System.out.println();
		System.out.println(ch); */
		
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(abs(i-j) > 1)
				System.out.println("i="+i+" j=" +j+" far");
				 else
				System.out.println("i="+i+" j=" +j+" close");
		
	}
}
	