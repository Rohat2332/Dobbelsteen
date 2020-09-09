
import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawRoundRect(50,50,100,100, 50, 50);
        g.fillArc(63,63,30,30, 360, 360);
        g.fillArc(63,103,30,30, 360, 360);
        g.fillArc(103,63,30,30, 360, 360);
        g.fillArc(103,103,30,30, 360, 360);
    }
}