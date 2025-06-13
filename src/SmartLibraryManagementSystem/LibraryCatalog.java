package SmartLibraryManagementSystem;

import java.util.LinkedList;

public class LibraryCatalog {
    private LinkedList<LibraryItem> catalog = new LinkedList<>();

    public  void addItem(LibraryItem item)
    {
        catalog.add(item);
        System.out.println("Item added: \"" + item.title + "\"");
    }
    public  void removeItem(String id)
    {
        catalog.removeIf(item -> item.id.equals(id));
    }
    public void SearchByTitle(String keyword)
    {
        for (LibraryItem item : catalog) {
            if (item.title.toLowerCase().contains(keyword.toLowerCase())) {
                item.getItemDetails();
            }
        }
    }
    public  void listAvailableItems()
    {
        for (LibraryItem item : catalog) {
            if (item.isAvailable()) {
                item.getItemDetails();
            }
        }

    }
}
