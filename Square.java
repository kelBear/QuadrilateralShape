
public class Square extends QuadrilateralShape{
	protected double length;
	public Square(){
		length=1.0;
	}
	public Square(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}
	public double findArea() {
		return length*length;
	}
	public double findPerimeter() {
		return length*4;
	}
	public String toString () {
		return ("Length: "+length+"\n"+"Area: "+findArea()+"\n"+"Perimeter: "+findPerimeter());
	}
}
