import java.applet.Applet;
import java.awt.*;
/*<applet code="AnimationApplet" width="400" height="400"> </applet>*/
public class AnimationApplet extends Applet
{
    Image picture;
    public void init()
    {
        picture=getImage(getDocumentBase(),"Image.JPG");
    }
    public void paint(Graphics g)
    {
        for(int i=0;i<500;i++){
        g.drawImage(picture,i,30,this);
        try{
            Thread.sleep(100);
        }catch(Exception e){}
        }
    }
}
