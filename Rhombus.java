
public class Rhombus extends Square{
	protected double height;
	public Rhombus(){
		height=1.0;
	}
	public Rhombus(double height){
		this.height=height;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double findArea() {
		return length*height;
	}
	public double findPerimeter() {
		return length*2+height*2;
	}
}
