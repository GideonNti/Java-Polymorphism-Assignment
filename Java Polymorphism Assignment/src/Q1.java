
class Shape{
	private String color;
	
	public Shape (String cl) {
	      color = cl;
	   }
	
	 public double getArea() {

	      System.err.println("Shape is unknown");
	      return 0;
}
	 
	 
	   public String toString() {
	      return "Shape[color=" + color + "]";
	   }
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(String color,int l, int w) {
		super(color);
		length = l;
		width = w;
	}
	
	public double getArea() {
	      return length*width;
	   }
	 
	   public String toString() {
	      return "Rectangle : [length = " + length + ",width = " + width + "," + super.toString() + "]";
	   }
	
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	
	   public String toString() {
	      return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
	   }
	 
	   public double getArea() {
	      return 0.5*base*height;
}
}

public class Q1 {

	public static void main(String[] args) {
		 Shape obj1 = new Rectangle("Green", 12, 15);
		 System.out.println(obj1);
		 System.out.println("Area is " + obj1.getArea());
	}

}
