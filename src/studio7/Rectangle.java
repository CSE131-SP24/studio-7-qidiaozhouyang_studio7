package studio7;

public class Rectangle {
	private double length;
	private double width;
	private String name;
	
	public Rectangle() {}
	
	public Rectangle(double length, double width, String name) {
		this.length = length;
		this.width = width;
		this.name = name;
	}
	
	public void setlength(double length) {
		this.length = length;
	}
	
	public double getlength() {
		return length;
	}
	
	public void setwidth(double width) {
		this.width = width;
	}
	
	public double getwidth() {
		return width;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public void area (Rectangle rectangle) {
		double area = rectangle.getlength()*rectangle.getwidth();
		System.out.println(area);
	}
	
	public Boolean same (Rectangle rectangle) {
		if (rectangle.getlength() == rectangle.getwidth()) {
			return true;
		}
		return false;
	}
	


}
