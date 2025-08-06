public class PaidTrafficSystemMain {
    public static void main(String[] args) {
        User user = new User("teste", "teste@email.com");
        Campaign campaign = new Campaign("Spring Campaign", AdPlatform.GOOGLE, 1500);

        campaign.displaySummary();

        Ad ad1 = new ImageAd("Promo", "Buy now", "https://image.jpg");
        Ad ad2 = new VideoAd("Watch This", "Check out the video!", "https://video.mp4");

        ad1.display();
        ad2.display();

        Metric metric = new Metric(120, 1000);
        metric.displayMetrics();

        Budget budget = new Budget();
        budget.increaseBudget(250);
        System.out.println("Current Budget: $" + budget.getTotalAmount());
    }
}