import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class StringBullying {
    public static void main(String[] args) {
        String myResources = "Lesson8/resources/";
        String fileName1 = "file1.txt";
        String fileName2 = "file2.txt";
        String fileName3 = "file3.txt";
        String filePath1 = "D://SomeDir//file1.txt";
        String filePath2 = "D://SomeDir//file2.txt";
        String filePath3 = "D://SomeDir//file3.txt";
        String catalogName = "D://SomeDir";
        String zipName = "D://SomeDir.zip";
        String newCatalogName = "D://SomeCatalog";
        String newZipName = "D://Dir1.zip";

//        new RecordString().recordReversString();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Can you enter names file, please");
//        String fileName = scanner.nextLine();
//        new TextFormatter().reader(fileName);

        BuilderCatalog catalog = new BuilderCatalog(catalogName);
        CreateFile file1 = new CreateFile(fileName1, catalogName);
        file1.writeInFile("Something");
        CreateFile file2 = new CreateFile(fileName2, catalogName);
        file2.writeInFile("Something more");
        CreateFile file3 = new CreateFile(fileName3, catalogName);
        file3.writeInFile("And Palindrome: deed ");
        ZipBuilder zip = new ZipBuilder(zipName, filePath1, filePath2, filePath3, fileName1, fileName2, fileName3);
        catalog.renameCatalog(newCatalogName);
        catalog.readCatalog();
        BuilderCatalog.deletedCatalog(catalog.getCatalog());
        CreateFile file = new CreateFile("Question2.txt", myResources);
        file.writeInFileAdd("Word1");
        file.writeInFileAdd("Word2");
        file.writeInFileAdd("Word3");
        file.writeInFileAdd("deed");
        CreateFile fileWithOnlyPalindromes = new CreateFile("FileWithOnlyPalindromes.txt", myResources);
        TextFormatter.readerPalindromes("Question2.txt", "FileWithOnlyPalindromes.txt");


    }


}
