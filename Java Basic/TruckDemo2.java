package ClassWork;

class Truck2 extends Vehicle{
	double cargocap;
	Truck2(int p, int f, int m, double c){
//	passenger = p;
//	fuelcap = f;
//	this.setMPG(m);
	super(p,f,m);	
	cargocap = c;
}
}

public class TruckDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck2 semi = new Truck2(2, 200, 7, 44000);
		Truck2 pickup = new Truck2(3, 28, 15, 2000);
		System.out.println(semi.passengers);
		System.out.println(semi.fuelcap);
		System.out.println(semi.cargocap);
		System.out.println(semi.mpg);
		System.out.println(semi.range());
		System.out.println();
		System.out.println(pickup.passengers);
		System.out.println(pickup.fuelcap);
		System.out.println(pickup.cargocap);
		System.out.println(pickup.mpg);
		System.out.println(pickup.range());
		
		
		
		
	}

}
