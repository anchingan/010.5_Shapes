
public class Rectangle extends Shape {
	private double width, height;
	
	public Rectangle(double width, double height) {
		if (width > 0)
			this.width = width;
		else
			this.width = 1;
		
		if (height > 0)
			this.height = height;
		else
			this.height = 1;
	}
	
	@Override
	double area() {
		return (this.height * this.width);
	}
	
	@Override
	double perimeter() {
		return ((this.height + this.width) * 2);
	}
	

}
