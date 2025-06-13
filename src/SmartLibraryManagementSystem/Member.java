package SmartLibraryManagementSystem;

import java.util.LinkedList;

public abstract class Member {
    private String memberId;
    private String name;
    private LinkedList<LibraryItem> borrowedItems;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedItems =  new LinkedList<>();
    }
    public abstract int getMaxBorrowLimit();

    public void borrowItem(LibraryItem item) {
        if (borrowedItems.size() < getMaxBorrowLimit() && item.isAvailable()) {
            item.borrow(memberId);
            borrowedItems.add(item);
        } else {
            System.out.println("Cannot borrow \"" + item.title + "\" - limit reached or unavailable.");
        }
    }

    public void returnItem(LibraryItem item) {
        if (borrowedItems.remove(item)) {
            item.returnItem();
        }
    }
}
