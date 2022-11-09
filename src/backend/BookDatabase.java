package backend;


public class BookDatabase extends Database {

    public BookDatabase(String filename) {
        super.setFilename(filename);
    }

    @Override
    public RecordType createRecordFrom(String line) {
        String[] bookData = line.split(",");
        return new Book(bookData[0], bookData[1], bookData[2], bookData[3], Integer.parseInt(bookData[4]));
    }

}
