import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class LineAndRectangleUsingApplet extends Applet {
    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(20, 30, 220, 30);
        graphics.setColor(Color.RED);
        graphics.drawRect(40, 60, 160, 90);
        graphics.setColor(new Color(220, 235, 255));
        graphics.fillRect(50, 70, 140, 70);
    }
}
