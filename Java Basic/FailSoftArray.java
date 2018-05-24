package ClassWork;

public class FailSoftArray {


		int a[];
		int size;
		int errval;
				
		public FailSoftArray(int size, int errval){
			this.size = size;
			a = new int[size];
			this.errval = errval;
			}
	int get(int index){
		if(index >= 0 && index < size)
			return a[index];
		else return errval;
	}
	
	int set(int index , int val){
		if(index >= 0 && index < size){
			a[index] =val;
		return val;
	}
	else return errval;
}

public static class ArrayDemo{	
public static void main(String[] args) {
	// TODO Auto-generated method stub
FailSoftArray sample = new FailSoftArray(5,9999999);
	
	int i;
	
	for (i=0;i<10;i++)
		sample.set(i, 10*i+1);
	
	for(i=0;i<10;i++)
	
		System.out.println("Sample["+i+"]=" +sample.get(i));
			
		}
}
}