
public class CircleImpl extends Circle{

	private double radius;
	private double length;
	private double width;
	public void setValue(double x, double y)
	{
		length=x;
		width=y;
	}
	
	public void setRadius(double x)
	{
		radius=x;
	}
	@Override
	public void aoc() {
		
		double aoc=pi*radius*radius;
		System.out.println("Area of circle :"+aoc);
		
	}
	@Override
	public void aor() {
		
		double aor=length*width;
		System.out.println("Area of rectangle :"+aor);
	}

}
