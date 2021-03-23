import java.util.Scanner;

public class ReaderId {

    static public int reader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Could You enter id product, please");
        int id = scanner.nextInt();
        return id;
    }
}
