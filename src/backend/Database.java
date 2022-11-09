package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Database {

    private ArrayList<RecordType> records = new ArrayList<>();
    private String filename;

    public Database(String filename) {
        this.filename = filename;
    }

    public Database() {
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void readFromFile() {
        File file = new File(filename);
        try ( Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                records.add(createRecordFrom(line));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("An error occurred!");
        }

    }

    public abstract RecordType createRecordFrom(String line);

    public ArrayList<RecordType> returnAllRecords() {
        return records;
    }

    public boolean contains(String key) {
        return getRecord(key) != null;
    }

    public RecordType getRecord(String key) {
        for (RecordType record : records) {
            if (key.equals(record.getSearchKey())) {
                return record;
            }
        }
        return null;
    }

    public void insertRecord(RecordType record) {
        records.add(record);
    }

    public void deleteRecord(String key) {
        records.remove(getRecord(key));
    }

    public void saveToFile() {
        File file = new File(filename);
        if (file.delete()) {
            try {
                FileWriter w = new FileWriter(filename);
                for (RecordType r : records) {
                    w.write(r.lineRepresentation());
                }
                w.close();
                //System.out.println("Successfully wrote to the file!");
            } catch (IOException e) {
                System.err.println("An error occurred!");
            }

        } else {
            System.err.println("Error deleting old file!");
        }
    }

}
