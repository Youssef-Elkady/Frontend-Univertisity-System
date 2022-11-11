package backend;


import java.time.LocalDate;

class StudentBookDatabase extends Database {

    public StudentBookDatabase(String filename) {
        super.setFilename(filename);
    }

    public StudentBookDatabase() {
    }

    @Override
    public RecordType createRecordFrom(String line) {
        String[] sB = line.split(",");
        return new StudentBook(sB[0], sB[1], LocalDate.parse(sB[2]));
    }

}
