package SmartLibraryManagementSystem;

public class PublicMember extends Member{
    public PublicMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public int getMaxBorrowLimit() {
        return 2;
    }
}
