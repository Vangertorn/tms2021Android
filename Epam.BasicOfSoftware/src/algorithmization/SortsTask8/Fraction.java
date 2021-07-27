package algorithmization.SortsTask8;

public class Fraction {
    long n, d; // numerator, denominator

    public Fraction(long n, long d) {
        this.n = n;
        this.d = d;
    }

    public Fraction setLCD(long lcd) {
        n *= (lcd / d);
        d = lcd;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", n, d);
    }

    public static int sort(Fraction f1, Fraction f2) {
        return Long.compare(f1.n, f2.n);
    }


    static long gcd(long a, long b) {
        long tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }


}
