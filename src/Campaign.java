public class Campaign {
    private String name;
    private AdPlatform platform;
    private double budget;

    public Campaign(String name, AdPlatform platform, double budget) {
        this.name = name;
        this.platform = platform;
        this.budget = budget;
    }

    public void displaySummary() {
        System.out.println("Campaign: " + name + " | Platform: " + platform + " | Budget: $" + budget);
    }
}