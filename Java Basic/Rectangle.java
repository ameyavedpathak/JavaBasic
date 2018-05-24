package ClassWork;

public class Rectangle {

	private double height, width;
	public Rectangle(double h, double w)
	{
		height = h;
		width = w;
	}

	public double perimeter(){
		return(2*(height+width));
	}
	public double area(){
		return(height*width);
	}
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}
	
}

