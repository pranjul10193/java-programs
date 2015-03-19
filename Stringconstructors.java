public class StringDemo{
	public static void main(String[] args) {
		char ch[]={'h','e','l','l','o'};
		char c[]=new char[5];
		String s1= new String("Indore");
		String s2= new String("my name is pranjul");
		String s3=new String(ch);
		String s4=new String(s1);
		String s5=new String(ch,0,3);
		System.out.println(c);
		System.out.println("Length of string s1=" +(s1.length()));
		System.out.println("s1=" +s1);
		System.out.println("s2=" +s2);
		System.out.println("s3=" +s3);
		System.out.println("s4=" +s4);
		System.out.println("s5=" +s5);
		System.out.println("character at position 3 of string s1 is =" + (s1.charAt(3)));
	}
}