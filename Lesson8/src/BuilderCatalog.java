import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class BuilderCatalog {
    private String nameCatalog;
    private File catalog;

    public File getCatalog() {
        return catalog;
    }

    public BuilderCatalog(String nameCatalog) {
        this.nameCatalog = nameCatalog;
        File catalog = new File(nameCatalog);
        catalog.mkdir();
        this.catalog = catalog;

    }

    public void renameCatalog(String newName) {
        File newCatalog = new File(newName);
        if (this.catalog.renameTo(newCatalog)) {
            deletedCatalog(this.catalog);
            this.nameCatalog = newName;
            this.catalog = newCatalog;
        } else {
            System.out.println("It's not OK");
        }
    }

    public static void deletedCatalog(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : Objects.requireNonNull(file.listFiles())) {
                deletedCatalog(f);
            }
        }
        file.delete();
        System.out.println("Deleted" + file.getAbsolutePath());

    }

    public String getNameCatalog() {
        return nameCatalog;
    }

    public void setNameCatalog(String nameCatalog) {
        this.nameCatalog = nameCatalog;
    }

    public void readCatalog() {
        if (this.catalog.isDirectory()) {
            for (File item : Objects.requireNonNull(this.catalog.listFiles())) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "\t folder");
                } else {
                    try (FileReader fileReader = new FileReader(item.getAbsolutePath())) {
                        int i;
                        StringBuilder result = new StringBuilder();
                        char[] text = new char[256];
                        while ((i = fileReader.read(text)) > -1) {
                            if (i < 256) {
                                text = Arrays.copyOf(text, i);
                            }
                            result.append(text);
                        }
                        System.out.println(result);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
