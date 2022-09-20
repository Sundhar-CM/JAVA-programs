public class Shape {
	int length=6;
	int breadth=8;
	int area;
	int radius=7;
	double pi=3.14;
	public static void main(String[] args) {
    	Square sq=new Square();
    	sq.areaSquare();
    	Rectangle rt=new Rectangle();
    	rt.areaRectangle();
    	Triangle ti=new Triangle();
    	ti.areaTriangle();
    	Circle ci=new Circle();
    	ci.areaCircle();
    	
	}
}

class Square extends Shape{
	public void areaSquare()
	{
		area=length*length;
		System.out.println("The area of Square is "+ area);
	}
}

class Rectangle extends Shape{
    void areaRectangle()
    {
    	area=length*breadth;
    	System.out.println("The area od Rectangle is "+ area);
    }
}
 class Triangle extends Shape{
	 void areaTriangle()
	 {
		double area=0.50*length*breadth; 
		System.out.println("The area of Triangle is "+area);
	 }
}
class Circle extends Shape{
	void areaCircle()
	{
		double area=2*pi*radius;
		System.out.println("The area of Circle is "+area);
	}
}
