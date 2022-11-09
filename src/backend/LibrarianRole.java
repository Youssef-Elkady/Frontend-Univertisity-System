package backend;

import constants.FileNames;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibrarianRole implements FileNames{

    private BookDatabase booksDatabase;
    private StudentBookDatabase sBDatabase;

    public LibrarianRole() {
        this.booksDatabase = new BookDatabase(BOOKS_FILENAME);
        booksDatabase.readFromFile();
        this.sBDatabase = new StudentBookDatabase(STUDENTSBOOKS_FILENAME);
        sBDatabase.readFromFile();
    }
    
    public BookDatabase getBooksDatabase() {
        return booksDatabase;
    }

    public StudentBookDatabase getsBDatabase() {
        return sBDatabase;
    }

    public void addBook(String id, String title, String authorName, String publisherName, int quantity) {

        if (booksDatabase.contains(id) == true) //adding same book to database
        {
            RecordType bRT = booksDatabase.getRecord(id);
            Book b = (Book) bRT;
            if (!b.getAuthorName().equals(authorName) || !b.getPublisherName().equals(publisherName) || !b.getTitle().equals(title)) {
                System.err.println("A book with this ID already exists!");
                return;
            } else {
                b.setQuantity(quantity + b.getQuantity());
            }
        } else if (id.startsWith("B")) {
            Book b = new Book(id, title, authorName, publisherName, quantity);
            booksDatabase.insertRecord(b);
        } else {
            System.err.println("Incorrect bookID format!");
            return;
        }
        logout();
    }

    public Book[] getListOfBooks() {
        Book[] book = new Book[booksDatabase.returnAllRecords().size()];
        return booksDatabase.returnAllRecords().toArray(book);
    }

    public StudentBook[] getListOfBorrowingOperations() {
        StudentBook[] sB = new StudentBook[sBDatabase.returnAllRecords().size()];
        return sBDatabase.returnAllRecords().toArray(sB);
    }

    public int borrowBook(String studentID, String bookID, LocalDate borrowDate) {

        RecordType b1 = booksDatabase.getRecord(bookID);
        Book b = (Book) b1;
        
        RecordType sBRT = sBDatabase.getRecord(studentID + "," + bookID);
        StudentBook sB = (StudentBook) sBRT;
        if (sB != null) {
            return 1;
        }
        
        if (b.getQuantity() == 0) {
            return 0;
        } 

        b.setQuantity(b.getQuantity() - 1);

        StudentBook borrowed = new StudentBook(studentID, bookID, borrowDate);
        sBDatabase.insertRecord(borrowed);
       
        logout();
        return 2;
    }

    public double returnBook(String studentId, String bookId, LocalDate returnDate) {

        if (booksDatabase.contains(bookId)) {
            RecordType bRT = booksDatabase.getRecord(bookId);
            Book b = (Book) bRT;
            b.setQuantity(b.getQuantity() + 1);

            RecordType sBRT = sBDatabase.getRecord(studentId + "," + bookId);
            StudentBook sB = (StudentBook) sBRT;
            long days = sB.getBorrowDate().until(returnDate, ChronoUnit.DAYS);

            sBDatabase.deleteRecord(studentId + "," + bookId);

            logout();

            return getLateFee(days);
        } else {
            System.err.println("Book not found!");
            return 0;
        }
    }

    private double getLateFee(long days) {
        if (days >= 7) {
            return (days - 7) * 0.5;
        }
        return 0;
    }

    public void logout() {
        booksDatabase.saveToFile();
        sBDatabase.saveToFile();
    }

}
