package SmartLibraryManagementSystem;

public class Faculty extends Member {


    public Faculty(String memberId, String name) {
        super(memberId, name);
    }

    public int getMaxBorrowLimit() {
        return 5;
    }
}
