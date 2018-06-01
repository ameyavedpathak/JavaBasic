import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				System.out.println("Please enter the number x1 x2 y1 y2");
				double x1 = scan.nextDouble();
				double y1 = scan.nextDouble();
				double x2 = scan.nextDouble();
				double y2 = scan.nextDouble();
				double d;
				
				d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
				//System.out.printf("x1%.1f, x2%.1f, y1%.1f, y2%.1f, Distance is d%.1f\n", x1,x2,y1,y2,d);
				System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+d);
				
		}
		}


	


