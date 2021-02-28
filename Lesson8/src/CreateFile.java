import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    private String nameFile;
    private String nameCatalog;

    public CreateFile(String nameFile, String nameCatalog) {
        this.nameFile = nameFile;
        this.nameCatalog = nameCatalog;
        File file = new File(nameCatalog, nameFile);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInFile(String string) {
        try (FileWriter fileWriter = new FileWriter(nameCatalog + "//" + nameFile, false)) {
            fileWriter.write(string);
            fileWriter.append((System.lineSeparator()));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInFileAdd(String string) {
        try (FileWriter fileWriter = new FileWriter(nameCatalog + "//" + nameFile, true)) {
            fileWriter.write(string);
            fileWriter.append((System.lineSeparator()));
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
