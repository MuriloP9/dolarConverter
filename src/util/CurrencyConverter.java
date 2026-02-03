package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double tax(double dolar, double bdolar) {
        return dolar * bdolar * (1.0 + IOF);
    }
}
