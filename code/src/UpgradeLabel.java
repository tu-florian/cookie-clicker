import javax.swing.*;

public class UpgradeLabel extends JLabel {
    private String prefix;
    public UpgradeLabel(String prefix, long upgradeCost){
        this.setText(prefix + upgradeCost);
        this.prefix = prefix;
    }

    public void displayUpgradeCost(long cost){
        this.setText(prefix + Long.toString(cost));
    }
}
