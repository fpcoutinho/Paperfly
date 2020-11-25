package business.report;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.*;

public class HTMLReport extends Report {

    public HTMLReport(String filePath){
        super(filePath);
    }

    @Override
    public void openFile() throws IOException {
        try {
            fileInputStream = new FileInputStream(filePath);
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException exception) {
            throw new IOException("Erro ao abrir arquivo HTML!", exception);
        }
    }

    @Override
    public String sendReport() {
        return "Dados do arquivo HTML enviados!";
    }

    @Override
    public void closeFile() throws IOException {
        try {
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException exception) {
            throw new IOException("Erro ao fechar arquivo HTML!", exception);
        }
    }
}
