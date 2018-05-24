package ClassWork;


class AA{
	
	//private int i,j;
	int i,j;
	AA(int a, int b){
		
		i = a;
		j = b;
	}
	
	void show(){
		
		System.out.println("i and j :" +i+ " "+j);
	}
}

class BB extends AA{
	int k;
	BB(int a , int b, int c){
		super(a,b);
		k = c;
		
	}
	void show(){
		//super.show();
		System.out.println("k:" +k);
	}
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB obj = new BB(1,2,3);
		obj.show();
	}

}
