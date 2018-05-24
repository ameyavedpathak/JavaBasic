package ClassWork;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {99,-10,100123,10,-978,5623,463,-9,287,49};
		
		int min, max;
		
		min= max = nums[0];
		
		for(int i=1; i<10; i++)
		{
			if(nums[i]<min) min = nums[i];
			if(nums[i]>max) max = nums[i];
					
		}	
		
		System.out.println("Min and Max :" +min +" "+max);
		
	}

}
