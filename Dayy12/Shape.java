package Dayy12;

public class Shape {
	public static void square(int side)
	{
		double perimeter=4*side;
		double area=side*side;
		System.out.println("Perimeter of Square :"+perimeter);
		System.out.println("Area of Square :"+	area);
	}
	
	public static void rectangle(int length,int breadth)
	{
		double perimeter=2*(length+breadth);
		double area=length*breadth;
		System.out.println("Perimeter of Rectangle is :"+perimeter);
		System.out.println("Area of Rectangle is :"+area);
	}
	
	public static void circle(int radius)
	{
		double perimeter=2*3.14*radius;
		double area=3.14*radius*radius;
		System.out.println("Perimeter of Circle is :"+perimeter);
		System.out.println("Area of Circle is :"+area);
	}
	
	public static void main(String[] args) {
		
		circle(5);
		rectangle(2,3);
		square(5);
		
	}

}
