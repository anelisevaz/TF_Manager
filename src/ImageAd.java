public class ImageAd extends Ad {
    private String imageUrl;

    public ImageAd(String title, String text, String imageUrl) {
        super(title, text);
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.println("Image Ad:");
        System.out.println("Title: " + title + "\nText: " + text + "\nImage: " + imageUrl);
    }
}