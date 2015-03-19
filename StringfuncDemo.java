public class StringfuncDemo{
	public static void main(String[] args) {
		String s1=new String("iam pranjul the superstar");
		String s2=new String(s1);
		String s3=new  String(" ,indore is my city");
		System.out.println("length of string is" + s1.length());
        System.out.println("character at 3rd position is" + s1.charAt(3));
        System.out.println("checking if s1 is equal to s2" + s1.equals(s2));
        System.out.println("checking ignoring case of s2" + s1.equalsIgnoreCase(s2));
        System.out.println("checking if region of s1 matches with s2" +s1.regionMatches(4,s2,4,7));
        System.out.println("checking if region matches of s1 with s2 ignoring case" +s1.regionMatches(true,4,s2,4,7));
        s1=s1+s3;
        System.out.println(s1);
        System.out.println("checks if string starts with i" + s3.startsWith("indore"));
        s1=s1.toUpperCase();
        System.out.println(s1);
        s1=s1.toLowerCase();
        System.out.println(s1);
	}
}  