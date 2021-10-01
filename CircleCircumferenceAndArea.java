package september27;

import java.util.Scanner;

public class CircleCircumferenceAndArea {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle..");
		double radius = sc.nextInt();
		sc.close();
		
		double circum = circumference(radius);
		double area= area(radius);
		System.out.println("The circumference of the circle is "+circum+" and Area is "+area+" .");
	}
	
	public static double circumference(double radius) {
		
		return 2*3.14*radius;
	}
	
	public static double area(double radius) {
		return 3.14*radius*radius;
	}

}
