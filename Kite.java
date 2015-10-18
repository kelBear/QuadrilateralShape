
public class Kite extends Rectangle{
	protected double side1;
	protected double side2;
	public Kite(){
		side1=1.0;
		side2=1.0;
	}
	public Kite(double side1, double side2){
		this.side1=side1;
		this.side2=side2;
	}
	public double getSide1 () {
		return side1;
	}
	public void setSide1 (double side1) {
		this.side1=side1;
	}
	public double getSide2 () {
		return side2;
	}
	public void setSide2 (double side2) {
		this.side2=side2;
	}
	public double findArea() {
		return (length*width)/2;
	}
	public double findPerimeter() {
		return side1*2+side2*2;
	}
}
