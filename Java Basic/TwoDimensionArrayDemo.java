package ClassWork;

public class TwoDimensionArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k,i;
		int table[][] = new int[3][4];
		
		for(k=0;k<3;k++)
		{
			for(i=0;i<4;i++)
			{
				table[k][i] = (k*4)+i+1;
				System.out.println(table[k][i]+"");
							
			}
			System.out.println();
			
		}
			
	}

}
