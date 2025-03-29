import java.applet.*;
import java.awt.*;
/*<applet code="Applet1.class" width="400" height="400">
</applet>*/
public class Applet1 extends Applet
{
	public void print(Graphics g)
	{
		g.drawString("Hello World",100,150);
		g.drawline(100,1200,300,400)
	}
}
