class cubicmile2cubicinches{
	public static void main(String args[]){
		long miles = 1;
		long feet = 5280*miles;
		long inches = 12*feet;
		long cubicmile = miles*miles*miles;
		long cubicinches = inches*inches*inches;
				
			System.out.println("1 Mile is 5280 feet");
			System.out.println("1 feet is 12 inches");
			System.out.println(miles+" Miles is "+inches+" inches");
			System.out.println(cubicmile +" cubic miles is "+cubicinches+" cubicinches");
		
	}
}