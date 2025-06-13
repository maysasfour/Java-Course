package SmartLibraryManagementSystem;

public abstract class LibraryItem implements Borrowable{

    protected String id;

    protected String title;

    protected String author;

    protected boolean isAvailable;


    public LibraryItem(String id, String title, String author) {

        this.id = id;

        this.title = title;

        this.author = author;

        this.isAvailable = true;

    }


    public abstract void getItemDetails();


    public boolean isAvailable() {

        return isAvailable;

    }


    public void setAvailable(boolean status) {

        this.isAvailable = status;

    }


// Add other common methods as needed

}

