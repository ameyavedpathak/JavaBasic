public class DistanceDemo {
		
	public static double distanceD(double x1, double y1, double x2, double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
	}

	public static void main(String[] args){
		
		System.out.println("distance is " + distanceD(1,1,10,1));
		System.out.println("distance is " + distanceD(2,2,5,6));
		System.out.println("distance is " + distanceD(3,3,4,5));
	}
}
	
