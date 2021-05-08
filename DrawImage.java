import java.awt.*;
import java.applet.Applet;
/*<applet code="DrawImage" width="400" height="400"> </applet>*/
public class DrawImage extends Applet
{
    Image picture;
    public void init()
    {
        picture=getImage(getDocumentBase(),"Image.JPG");
    }
    public void paint(Graphics g)
    {
        g.drawImage(picture,30,30,this);
    }
}
