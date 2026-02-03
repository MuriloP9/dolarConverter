package aplicattion;
import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


        System.out.println("What is dolar price? ");
    double dolar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
    double bdolar = sc.nextDouble();

    double resultado = CurrencyConverter.tax(dolar, bdolar);

        System.out.printf("Amount to be paid in reias = %.2f%n", resultado);
    }
}