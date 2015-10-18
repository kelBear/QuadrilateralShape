
public class Rectangle extends Square{
	protected double width;
	public Rectangle(){
		width=1.0;
	}
	public Rectangle(double width){
		this.width=width;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double findArea() {
		return length*width;
	}
	public double findPerimeter() {
		return length*2+width*2;
	}
}
