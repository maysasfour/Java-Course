package SmartLibraryManagementSystem;

public interface Borrowable {
    void borrow(String memberId);

    void returnItem();

    boolean isAvailable();
}
