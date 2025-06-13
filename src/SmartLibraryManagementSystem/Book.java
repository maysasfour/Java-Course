package SmartLibraryManagementSystem;

public class Book extends LibraryItem implements Borrowable{

    private int pageCount;

    public Book(String id, String title, String author, int pageCount) {
        super(id, title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void getItemDetails() {
        System.out.println("Book - Title: " + title + ", Author: " + author + ", Pages: " + pageCount);

    }

    @Override
    public void borrow(String memberId) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed by " + memberId + ": \"" + title + "\"");
        } else {
            System.out.println("Book is not available: \"" + title + "\"");
        }
    }

    @Override
    public void returnItem() {
        isAvailable = true;
        System.out.println("Book returned: \"" + title + "\"");
    }
}
