public class CookieCounter {
    private long cookies;
    private long multiplicator;
    private CookieLabel cookieLabel;

    public CookieCounter(CookieLabel cookieLabel){
        cookies = 0;
        multiplicator = 1;
        this.cookieLabel = cookieLabel;
    }

    public void addCookie(){
        cookies += multiplicator;
        cookieLabel.displayCookies(cookies);
    }

    public void upgradeMultiplicator(){
        if (cookies >= this.getUpgradeCost()){
            cookies -= this.getUpgradeCost();
            multiplicator = 1 + (multiplicator*2);
            cookieLabel.displayCookies(cookies);
        }
    }

    public Long getUpgradeCost(){
        return multiplicator*5;
    }

    public long getCookies() {
        return cookies;
    }

    public long getMultiplicator() {
        return multiplicator;
    }
}
