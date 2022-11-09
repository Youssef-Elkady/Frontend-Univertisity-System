package backend;

import constants.FileNames;


public class AdminRole implements FileNames{

    private LibrarianUserDatabase database;

    public AdminRole() {
        this.database = new LibrarianUserDatabase(LIBRARIANS_FILENAME);
        database.readFromFile();
    }

    public LibrarianUserDatabase getDatabase() {
        return database;
    }

    public void addLibrarian(String librarianId, String name, String email, String address, String phoneNumber) {
        if (database.contains(librarianId) == true) {
            System.err.println("A librarian with this ID already exists!");
            return;
        } else if (librarianId.startsWith("L")) {
            LibrarianUser user = new LibrarianUser(librarianId, name, email, address, phoneNumber);
            database.insertRecord(user);
            database.saveToFile();
        } else {
            System.err.println("Incorrect librarianID format!");
        }
    }

    public LibrarianUser[] getListOfLibrarians() {
        LibrarianUser[] user = new LibrarianUser[database.returnAllRecords().size()];
        return database.returnAllRecords().toArray(user);
    }

    public void removeLibrarian(String key) {
        database.deleteRecord(key);
        database.saveToFile();
    }

    public void logout() {
        database.saveToFile();
    }
}
