public class StringBuffDemo{
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer(" pranjul");
		StringBuffer s3=new StringBuffer(" is super hot!");
		StringBuffer s4=new StringBuffer(s2);
		StringBuffer s5=new StringBuffer(10);
	    System.out.println("appending the strings s2 with s3 " + s2.append(s3));
	    System.out.println("inserting 'miss' in s2 " + s2.insert(0,"miss"));
	    System.out.println("we can concatenate s2 with any other datatype like in " + s2.append(21));
	    System.out.println("deleting '!' in s2 " + s2.deleteCharAt(19));
	    System.out.println("character at 5th position " + s4.charAt(5));
	    System.out.println("reversing the s4 string " + s4.reverse());
	    System.out.println("length of the s4 string " + s4.length());
	    System.out.println("capacity of the string s5 "+ s5.capacity());
	    s5.setLength(12);
	    System.out.println("new capacity and length is "+ s5.capacity() + s5.length());
	    System.out.println(s2);
	}
}