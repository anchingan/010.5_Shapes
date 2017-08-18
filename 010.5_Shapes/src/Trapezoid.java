
public class Trapezoid extends Shape {
	
	private double upperBase, lowerBase, height;
	
	public Trapezoid(double upperBase, double lowerBase, double height) {
		if (upperBase > 0)
			this.upperBase = upperBase;
		else 
			this.upperBase = 1;
		if (lowerBase > 0)
			this.lowerBase = lowerBase;
		else
			this.lowerBase = 1;
		if (height > 0)
			this.height = height;
		else
			this.height = 1;
	}
	
	@Override
	double area() {
		return ((this.upperBase + this.lowerBase) * this.height / 2);
	}
	
	@Override
	double perimeter() {
		double leg = Math.sqrt(Math.pow(((this.lowerBase-this.upperBase) / 2), 2) + this.height * this.height);
		
		return (this.upperBase + this.lowerBase + leg * 2);
	}

}
