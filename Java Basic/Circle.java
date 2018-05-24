package ClassWork;

public class Circle {
	private double radius;
	double PI =  3.14159;
	static int count =0;
	public Circle(double radius)
	{
	this.setRadius(radius);
	System.out.println("Circle(" +radius+ ")");
	count++;
	}

	public double perimeter(){
		return(2*PI*getRadius());
	}
	public double area(){
		return(PI*getRadius()*getRadius());
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
}
