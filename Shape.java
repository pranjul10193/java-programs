public class Shape{
	void area(float b, float l)
	{
		float res;
		res=l*b;
		System.out.println("the area of rectangle is"+res);
	}
	void area(float r)
	{
		float res;
		res=3.14*r*r;
		System.out.println("the area of circle is"+res);
	}
	void area(int s)
	{
		int res;
		res=a*a;
		System.out.println("the area of square is"+res);
	}
	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.area(22.2,64.2);
		s1.area(76);
		s1.area(27.5);
	}
}