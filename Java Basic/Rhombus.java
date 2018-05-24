package ClassWork;

public class Rhombus {
	private double side, angle;
		
		public Rhombus(double side, double angle) {
			this.side = side;
			this.angle = angle;
		}
		public double perimeter() {
			return side*4;
		}
		public double area() {
			return side*side* Math.sin(Math.toRadians(angle));
		}
		public double getSide() {
			return side;
		}
	}
	

