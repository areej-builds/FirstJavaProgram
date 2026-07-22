class Circle{
	double radius=3.50;
	public double calculateArea(){
		return Math.PI*radius*radius;
	}

	public double calculatePerimeter(){
		return 2*Math.PI*radius;
	}
}

public class CircleTest{
	public static void main(String[]args){
		Circle circle=new Circle();
	System.out.printf("Radius of a circle: %.2f%n",circle.radius); 
	System.out.printf("Area of a circle: %.2f%n",circle.calculateArea());
	System.out.printf("Perimeter of a circle: %.2f%n",circle.calculatePerimeter());
	}
} 
