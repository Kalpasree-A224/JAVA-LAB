import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("removal")
public class insertdemo extends Applet implements ActionListener {
    private final TextField text = new TextField("Java", 20);

    @Override
    public void init() {
        setLayout(new FlowLayout());
        Button insert = new Button("Insert !");
        insert.addActionListener(this);
        add(text);
        add(insert);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int position = text.getCaretPosition();
        String currentText = text.getText();
        text.setText(currentText.substring(0, position) + "!" + currentText.substring(position));
        text.setCaretPosition(position + 1);
        text.requestFocus();
    }
}
