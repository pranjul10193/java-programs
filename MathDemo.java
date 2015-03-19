public class MathDemo
{
	public void show(double d)
  {
  	System.out.println("your result is"+d );
  }
  public static void main(String[] args) {
  	MathDemo m1=new MathDemo();
   double f1= Math.pow(22.1,3);
   double f2= Math.sqrt(1.44);
   double f3= Math.max(2.24,2.227); 
   m1.show(f1);
   m1.show(f2);
   m1.show(f3);
  }
  
}
