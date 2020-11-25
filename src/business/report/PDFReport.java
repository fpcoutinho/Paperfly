package business.report;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PDFReport extends Report {

    public PDFReport(String filePath){
        super(filePath);
    }

    @Override
    public void openFile() throws IOException {
        try {
            fileInputStream = new FileInputStream(filePath);
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException exception) {
            throw new IOException("Erro ao abrir arquivo PDF!", exception);
        }
    }

    @Override
    public String sendReport() {
        return "Dados do arquivo PDF enviados!";
    }

    @Override
    public void closeFile() throws IOException {
        try {
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException exception) {
            throw new IOException("Erro ao fechar arquivo PDF!", exception);
        }
    }
}
