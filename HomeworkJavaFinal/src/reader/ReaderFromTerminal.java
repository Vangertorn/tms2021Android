package reader;

import reader.exception.IncorrectAmountException;
import reader.exception.IncorrectIdException;
import reader.interfaces.ReaderAmount;
import reader.interfaces.ReaderId;
import reader.interfaces.ReaderInt;
import reader.interfaces.ReaderString;
import supporting.DisplaySeparator;

import java.util.Scanner;

public class ReaderFromTerminal implements ReaderId, ReaderAmount, ReaderInt, ReaderString {

    @Override
    public Integer readerId() {
        try {
            DisplaySeparator.display();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Could You enter id, please");
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number.intValue() <= 0) {
                throw new IncorrectIdException("product's id  can't be equal zero, try to enter id on more time");
            }
            return number;
        } catch (IncorrectIdException s) {
            System.err.println(s.getMessage());
            return 0;
        } catch (NumberFormatException s) {
            System.err.println("You entered incorrect value. Could You choose " +
                    "from the suggested digital values, please");
            return 0;
        }
    }

    @Override
    public Integer readerAmount() {
        try {
            DisplaySeparator.display();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Could You enter amount product that You want to buy, please");
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number.intValue() < 0) {
                throw new IncorrectAmountException("You can't buy a negative quantity product");
            }
            return number;
        } catch (IncorrectAmountException s) {
            System.err.println(s.getMessage());
            readerAmount();
        } catch (NumberFormatException s) {
            System.err.println("You entered incorrect value. Could You try again, please");
            readerAmount();
        }
        return 0;
    }

    @Override
    public Integer readerInt() {
        try {
            Scanner scanner = new Scanner(System.in);
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException s) {
            System.err.println("You entered incorrect value. Could You choose" +
                    " from the suggested digital values, please");
        }
        return 0;
    }

    @Override
    public String readerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
