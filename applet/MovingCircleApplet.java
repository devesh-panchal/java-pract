// Draw Ellipses
import java.awt.*;
import java.applet.*;
/*
<applet code="MovingCircleApplet" width=300 height=200>
</applet>
*/
public class MovingCircleApplet extends Applet {
int x=200,y=200,r=50,dx=1;	
public void paint(Graphics g) {


g.drawOval(x, y, r, r);
while(true)
{
	if(x+50==499)
	dx=-1;
	if(x-50==0)
	dx=1;	

	g.setColor(Color.WHITE);
	g.drawOval(x, y, r, r);
	
	x+=dx;
	g.setColor(Color.BLACK);
	g.drawOval(x, y, r, r);
	
	try
	{
		Thread.sleep(5);
	}
	catch(InterruptedException ie)
	{
		System.out.println("Thread Interrupted:");
	}




}	

//g.fillOval(70, 90, 140, 100);
}
}