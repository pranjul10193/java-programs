public class ShapeDemo{
	void area(double b, double l)
	{
		double res;
		res=l*b;
		System.out.println("the area of rectangle is"+res);
	}
	void area(double r)
	{
		double res;
		res=3.14*r*r;
		System.out.println("the area of circle is"+res);
	}
	void area(int a)
	{
		int res;
		res=a*a;
		System.out.println("the area of square is"+res);
	}
	public static void main(String[] args) {
		ShapeDemo s1=new ShapeDemo();
		s1.area(22.2,64.2);
		s1.area(76);
		s1.area(27.5);
	}
}//method overloading demonstration