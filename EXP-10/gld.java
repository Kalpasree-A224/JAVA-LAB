import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;

@SuppressWarnings("removal")
public class gld extends Applet {
    @Override
    public void init() {
        setLayout(new GridLayout(2, 3, 5, 5));
        for (int cell = 1; cell <= 6; cell++) {
            add(new Button("Cell " + cell));
        }
    }
}
