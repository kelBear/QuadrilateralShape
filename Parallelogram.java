
public class Parallelogram extends Rhombus{
	protected double side;
	public Parallelogram(){
		side=1.0;
	}
	public Parallelogram(double side){
		this.side=side;
	}
	public double getSide () {
		return side;
	}
	public void setSide (double side) {
		this.side=side;
	}
	public double findArea() {
		return length*height;
	}
	public double findPerimeter() {
		return length*2+side*2;
	}
}
