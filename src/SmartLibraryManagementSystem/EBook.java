package SmartLibraryManagementSystem;

public class EBook extends LibraryItem implements Borrowable {
    private double fileSizeMB;

    public EBook(String id, String title, String author, double fileSizeMB) {
        super(id, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void getItemDetails() {
        System.out.println("EBook - Title: " + title + ", Author: " + author + ", File Size: " + fileSizeMB + "MB");
    }

    @Override
    public void borrow(String memberId) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("EBook borrowed by " + memberId + ": \"" + title + "\"");
        } else {
            System.out.println("EBook is not available: \"" + title + "\"");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("EBook returned: \"" + title + "\"");
    }
    public void download()
    {
        System.out.println("Downloading: \"" + title + "\"");
    }
}
