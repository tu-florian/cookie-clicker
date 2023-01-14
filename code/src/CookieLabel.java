import javax.swing.*;

public class CookieLabel extends JLabel {
    private String prefix;
    public CookieLabel(String prefix){
        this.setText(prefix + "0");
        this.prefix = prefix;
    }

    public void displayCookies(long amount){
        this.setText(prefix + Long.toString(amount));
    }
}
