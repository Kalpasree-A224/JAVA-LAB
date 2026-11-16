import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class HumanFaceUsingApplet extends Applet {
    @Override
    public void paint(Graphics graphics) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int faceWidth = 160;
        int faceHeight = 200;

        graphics.setColor(new Color(255, 220, 177));
        graphics.fillOval(centerX - faceWidth / 2, centerY - faceHeight / 2, faceWidth, faceHeight);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(centerX - 42, centerY - 30, 12, 12);
        graphics.fillOval(centerX + 30, centerY - 30, 12, 12);
        graphics.drawArc(centerX - 35, centerY + 10, 70, 45, 200, 140);
    }
}
