import javax.swing.*;
import java.awt.*;

public class CookieClickerFrame extends JFrame {
    CookieLabel cookieLabel;
    CookieCounter cookieCounter;
    CookieButton cookieButton;
    UpgradeButton upgradeButton;
    UpgradeLabel upgradeLabel;

    public CookieClickerFrame() {
        this.setBounds(100,100, 500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(2, 2));

        cookieLabel = new CookieLabel("Cookies: ");
        this.add(cookieLabel);

        cookieCounter = new CookieCounter(cookieLabel);

        upgradeLabel = new UpgradeLabel("Upgrade cost: ", cookieCounter.getUpgradeCost());
        this.add(upgradeLabel);

        cookieButton = new CookieButton("Click me!", cookieCounter);
        this.add(cookieButton);

        upgradeButton = new UpgradeButton(cookieCounter, upgradeLabel);
        this.add(upgradeButton);

        this.setVisible(true);
    }
}
