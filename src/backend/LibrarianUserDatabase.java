package backend;


public class LibrarianUserDatabase extends Database {

    public LibrarianUserDatabase() {
    }

    public LibrarianUserDatabase(String filename) {
        super.setFilename(filename);
    }

    @Override
    public RecordType createRecordFrom(String line) {
        String[] user = line.split(",");
        return new LibrarianUser(user[0], user[1], user[2], user[3], user[4]);
    }

}
