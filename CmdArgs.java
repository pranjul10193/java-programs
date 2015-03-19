public class CmdArgs{
     static int x,y;
	public static void main(String args[]) {
		CmdArgs c1=new CmdArgs();
		if(args.length==2) {
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			c1.sum();
		}
		else {
			System.out.println("enter exactly two arguments");
		}
	}
	public void sum() {
		System.out.println("you answer is"+(x+y));
	}
}