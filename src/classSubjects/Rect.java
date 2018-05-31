package classSubjects;

public class Rect {
	private int width;
	private int length;

	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int calculateArea() {
		return width*length;

	}
	public int claculatePerimetre() {
		return (width+length)*2;
	}
	

}
