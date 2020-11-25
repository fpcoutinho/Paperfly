package business.report;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class Report {
    String filePath;
    FileInputStream fileInputStream;
    ObjectInputStream objectInputStream;

    public Report(String filePath) {
        this.filePath = filePath;
    }

    //abstract methods
    abstract void openFile() throws IOException;
    abstract String sendReport();
    abstract  void closeFile() throws IOException;

    public ObjectInputStream getObjectInputStream() {
        return objectInputStream;
    }
}
