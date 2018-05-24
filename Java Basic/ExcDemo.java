package ClassWork;

public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10,20,30,40,50};
		for(int i=0; i<=numbers.length;i++)
		try{
			System.out.println("Number["+i+"]=" +numbers[i]);
			}
		catch(ArrayIndexOutOfBoundsException exc){
				System.out.println("Index OutofBounds happened - ignored");
				}
		catch (Throwable exc) {
			// TODO: handle exception
			System.out.println("Some Exception happened - ignored");
		}
			}	
	}


