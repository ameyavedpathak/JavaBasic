package ClassWork;

class X{
int a; 

X(int i) {a = i;}
	}

class Y extends X{
	int a ;
	Y(int i) 
	{
		super(i);
	}
}

public class IncompatibleRef {

	public static void main(String[] args) {
		X x = new X(10);
		X x2;
		Y y = new Y(5);
		
			x2 = x;
			//x2= y;
			
	}

}
