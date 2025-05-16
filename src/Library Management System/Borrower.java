import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Borrower {
    private int BorrowerID;
    private String Name;

    private List<Book> BorrowedBooks = new ArrayList<>();
    private Date Due_Date;
}