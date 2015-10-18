
public class Trapezoid extends Parallelogram{
	protected double top;
	protected double bottom;
	public Trapezoid(){
		top=1.0;
		bottom=1.0;
	}
	public Trapezoid(double top, double bottom){
		this.top=top;
		this.bottom=bottom;
	}
	public double getTop(){
		return top;
	}
	public void setTop (double top){
		this.top=top;
	}
	public double getBottom () {
		return bottom;
	}
	public void setBottom (double bottom) {
		this.bottom=bottom;
	}
	public double findArea() {
		return ((top+bottom)*height)/2;
	}
	public double findPerimeter() {
		return side*2+top+bottom;
	}
}
