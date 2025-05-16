class Book{
private String Title;
private String Author;
private String ISBN;
private boolean Availability;
public Book(){

}

    public Book(String title, String author, String ISBN, boolean availability) {
        Title = title;
        Author = author;
        this.ISBN = ISBN;
        Availability = availability;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean availability) {
        Availability = availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + getTitle() + '\'' +
                ", Author='" + getAuthor() + '\'' +
                ", ISBN='" + getISBN() + '\'' +
                ", Availability=" + isAvailability() +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", availability=" + isAvailability() +
                '}';
    }
}