
public abstract class QuadrilateralShape {
	protected String colour;
	private static int numQuads = 0;
	public QuadrilateralShape() {
		colour="blue";
		numQuads++;
	}
	public QuadrilateralShape (String colour){
		this.colour=colour;
	}
	public String getColour (){
		return colour;
	}
	public void setColour (String colour) {
		this.colour=colour;
	}
	public abstract double findArea();
	public abstract double findPerimeter();
}
