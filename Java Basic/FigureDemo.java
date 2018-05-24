package ClassWork;

public class FigureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Square s1 = new Square(6);
		System.out.println(s1.getSide());
		System.out.println(s1.area());
		
		Rectangle r1 = new Rectangle(6,10);
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		System.out.println(r1.area());
		
//		Circle c1 = new Circle(5);
//		Circle c2 = new Circle(15.0);
//		System.out.println("c1.radius: "+c1.getRadius());
//		System.out.println("c1.area: "+c1.area());
//		System.out.println("c1.perimeter: "+c1.perimeter());

		EqTriangle et1 = new EqTriangle(6);
		System.out.println("et1.side: "+et1.getSide());
		System.out.println("et1.area: "+et1.area());
		System.out.println("et1.perimeter: "+et1.perimeter());
		
		Rhombus rh1 = new Rhombus(5, 20);
		System.out.println("rh1.side: "+rh1.getSide());
		System.out.println("rh1.area: "+rh1.area());
		System.out.println("rh1.perimeter: "+rh1.perimeter());
				
	}

}
