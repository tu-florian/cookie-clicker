import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpgradeButton extends JButton {
    private CookieCounter cookieCounter;
    private UpgradeLabel upgradeLabel;

    public UpgradeButton(CookieCounter cookieCounter, UpgradeLabel upgradeLabel) {
        this.cookieCounter = cookieCounter;
        this.setText("Upgrade your cookies");
        this.upgradeLabel = upgradeLabel;

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookieCounter.upgradeMultiplicator();
                upgradeLabel.displayUpgradeCost(cookieCounter.getUpgradeCost());
            }
        });
    }
}
