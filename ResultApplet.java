import java.awt.*;
import java.applet.Applet;
public class ResultApplet extends Applet{
	TextField t1,t2,t3,t4;
	String s1,s2,s3;
	public void init(){
		t1= new TextField(20);
		t2=new TextField(5);
		t3=new TextField(5);
		t4=new TextField(5);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		s2=getParameter("maths");
		t2.setText(s2);
		s3=getParameter("science");
		t3.setText(s3);
		s1=getParameter("english");
		t4.setText(s1);
	}
	public void paint(Graphics g){
		int x,y,z,result;
		x=Integer.parseInt(s2);
		y=Integer.parseInt(s3);
		z=Integer.parseInt(s1);
		result=(x+y+z)/3;
		t1.setText("result is ="+ result);

	}

}
/*<applet code= "-ResultApplet.class" height=300 width=300>
<param name="maths" value="89">
<param name="science" value="79">
<param name="english" value="99">
</applet> */