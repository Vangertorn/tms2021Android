import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipBuilder {
    private ZipOutputStream zipOutputStream;
    private String zipName;
    private String filePath1;
    private String filePath2;
    private String filePath3;
    private String fileName1;
    private String fileName2;
    private String fileName3;

    public ZipBuilder(String zipName, String filePath1, String filePath2, String filePath3,
                      String fileName1, String fileName2, String fileName3) {
        this.zipName = zipName;
        this.filePath1 = filePath1;
        this.filePath2 = filePath2;
        this.filePath3 = filePath3;
        this.fileName1 = fileName1;
        this.fileName2 = fileName2;
        this.fileName3 = fileName3;

        try (
                ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipName));
                FileInputStream fis1 = new FileInputStream(filePath1);
                FileInputStream fis2 = new FileInputStream(filePath2);
                FileInputStream fis3 = new FileInputStream(filePath3)) {


            ZipEntry entry = new ZipEntry(fileName1);
            outputStream.putNextEntry(entry);
            byte[] buffer = new byte[fis1.available()];
            fis1.read(buffer);
            outputStream.write(buffer);
            outputStream.closeEntry();
            entry = new ZipEntry(fileName2);
            outputStream.putNextEntry(entry);
            buffer = new byte[fis2.available()];
            fis2.read(buffer);
            outputStream.write(buffer);
            outputStream.closeEntry();
            entry = new ZipEntry(fileName3);
            outputStream.putNextEntry(entry);
            buffer = new byte[fis3.available()];
            fis3.read(buffer);
            outputStream.write(buffer);
            outputStream.closeEntry();


        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}
