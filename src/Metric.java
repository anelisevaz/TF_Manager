public class Metric implements Monitorable {
    private int clicks;
    private int impressions;

    public Metric(int clicks, int impressions) {
        this.clicks = clicks;
        this.impressions = impressions;
    }

    @Override
    public void displayMetrics() {
        double ctr = (double) clicks / impressions * 100;
        System.out.println("Clicks: " + clicks + ", Impressions: " + impressions + ", CTR: " + ctr + "%");
    }
}