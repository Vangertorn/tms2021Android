package algorithmization.SortsTask8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static algorithmization.SortsTask8.Fraction.gcd;

public class SortFraction {
    public static void main(String[] args) {
        List<Fraction> fs = new ArrayList<>(Arrays.asList(new Fraction(9, 12), new Fraction(1, 2),
                new Fraction(3, 4), new Fraction(6, 7), new Fraction(1, 5), new Fraction(7, 8),
                new Fraction(9, 10), new Fraction(1, 2), new Fraction(5, 12), new Fraction(3, 8)));
        long lcd = fs.stream().mapToLong(f -> f.d).reduce(1, (d1, d2) -> d1 * d2 / gcd(d1, d2));
        fs.stream().map(f -> f.setLCD(lcd)).sorted(Fraction::sort).forEach(System.out::println);
    }
}
