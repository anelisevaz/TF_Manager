public class VideoAd extends Ad {
    private String videoUrl;

    public VideoAd(String title, String text, String videoUrl) {
        super(title, text);
        this.videoUrl = videoUrl;
    }

    @Override
    public void display() {
        System.out.println("Video Ad:");
        System.out.println("Title: " + title + "\nText: " + text + "\nVideo: " + videoUrl);
    }
}