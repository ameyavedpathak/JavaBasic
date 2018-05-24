package ClassWork;

public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle(1.0);
		System.out.println(Circle.count);
		System.out.println(c1.getRadius());
		System.out.println(c1.perimeter());
		System.out.println(c1.area());
		
		Circle c2 = new Circle(2.0);
		System.out.println(Circle.count);
		System.out.println(c1.getRadius());
		System.out.println(c1.perimeter());
		System.out.println(c1.area());
		
		c1.PI = 3.0;
		c2.PI = 2.0;
		System.out.println(c2.getRadius());
		System.out.println(c2.perimeter());
		System.out.println(c2.area());
		
	}

}
