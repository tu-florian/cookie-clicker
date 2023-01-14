import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieButton extends JButton {
    public CookieButton(String text, CookieCounter cookieCounter) {
        super(text);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookieCounter.addCookie();
            }
        });
    }
}
