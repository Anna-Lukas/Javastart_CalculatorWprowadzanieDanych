import java.util.Locale;
import java.util.Scanner;

public class CalcApp {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("podaj a");
        double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("podaj operator");
        String operator = scanner.nextLine();
        System.out.println("podaj b");
        double b = scanner.nextDouble();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a,b,operator);
        System.out.println(a +  operator + b + " + "+result);
    }
}
