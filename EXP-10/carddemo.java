import java.applet.Applet;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("removal")
public class carddemo extends Applet implements ActionListener {
    private final CardLayout cards = new CardLayout();
    private final Panel cardPanel = new Panel(cards);

    @Override
    public void init() {
        setLayout(new java.awt.BorderLayout());
        cardPanel.add(new Label("First card", Label.CENTER), "first");
        cardPanel.add(new Label("Second card", Label.CENTER), "second");
        Button next = new Button("Next card");
        next.addActionListener(this);
        add(cardPanel, java.awt.BorderLayout.CENTER);
        add(next, java.awt.BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        cards.next(cardPanel);
    }
}
