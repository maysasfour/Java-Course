package SmartLibraryManagementSystem;

public class AudioBook extends LibraryItem implements Borrowable {
    private double durationHours;
    private String narrator;

    public AudioBook(String id, String title, String author, double durationHours, String narrator) {
        super(id, title, author);
        this.durationHours = durationHours;
        this.narrator = narrator;
    }

    public double getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(double durationHours) {
        this.durationHours = durationHours;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public void getItemDetails() {
        System.out.println("AudioBook - Title: " + title + ", Author: " + author + ", Duration: " + durationHours + " hrs, Narrator: " + narrator);

    }

    @Override
    public void borrow(String memberId) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("AudioBook borrowed by " + memberId + ": \"" + title + "\"");
        } else {
            System.out.println("AudioBook is not available: \"" + title + "\"");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("AudioBook returned: \"" + title + "\"");
    }
    public void playPreview() {
        System.out.println("Playing preview of: \"" + title + "\"");
    }
}
