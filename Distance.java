import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double x1,y1,x2,y2; // the two sets of coordinates 
		double distance;// the distance between the two points
		
		System.out.print("Enter x1 and y1: ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		
		//distance = Math.sqrt( (x2-x1)^2 + (y2-y1)^2);
		distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("The distance is: " + distance);
	}

}
