public abstract class Ad {
    protected String title;
    protected String text;

    public Ad(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public abstract void display();

    public void editText(String newText) {
        this.text = newText;
    }
}