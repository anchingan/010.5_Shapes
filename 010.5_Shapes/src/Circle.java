
public class Circle extends Shape {
	private double radius;
	private final double pi = 3.14;
	
	public Circle(double radius) {
		if (radius > 0)
			this.radius = radius;
		else
			this.radius = 1;
	}
	
	@Override
	double area() {
		return (radius * radius * pi);
	}
	
	@Override
	double perimeter() {
		return (radius * 2 * pi);
	}

}
