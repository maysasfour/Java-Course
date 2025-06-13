package SmartLibraryManagementSystem;

public class LibraryTester {
    public static void main(String[] args) {

//
//        Part 3: Sample Use Cases to Implement
//
//        1. Create a catalog and add different items.
//
//        2. Create at least 3 different members and simulate borrowing and returning items.
//
//        3. Demonstrate polymorphic behavior via:
//
//        o Different item details
//
//        o Different borrowing limits
//
//        o Interface method behavior
//
//        4. Show handling of unavailable items.
//
//        5. Use LinkedLists to manage borrowed items and library inventory.
//

//
//📦 Example Output:
//
//        Book added: "Effective Java"
//
//        Student John borrowed: "Effective Java"
//
//        AudioBook added: "Think Like a Monk"
//
//        Faculty Sara borrowed: "Think Like a Monk"
//
//        Attempt to borrow already borrowed book: FAILED
//
//        Student John returned: "Effective Java"

        LibraryCatalog catalog = new LibraryCatalog();

        Book book = new Book("B1", "Effective Java", "Joshua Bloch", 416);
        AudioBook audioBook = new AudioBook("A1", "Think Like a Monk", "Jay Shetty", 6.5, "Jay Shetty");

        catalog.addItem(book);
        catalog.addItem(audioBook);

        Student student = new Student("S1", "John");
        Faculty faculty = new Faculty("F1", "Sara");

        student.borrowItem(book);
        faculty.borrowItem(book);
        faculty.borrowItem(audioBook);

        student.returnItem(book);
        faculty.borrowItem(book);

        System.out.println("\nAvailable items:");
        catalog.listAvailableItems();


    }
}
