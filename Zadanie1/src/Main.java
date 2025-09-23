import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double StopnieCelcjusza, stopnieFahrenheita;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę w Celsjuszach:");
        StopnieCelcjusza = scanner.nextDouble();

        stopnieFahrenheita = 1.8 * StopnieCelcjusza + 32;
        System.out.println("Stopnie Fahrenheita: " + stopnieFahrenheita);


        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        int najwieksza = Math.max(a, Math.max(b, c));
        int najmniejsza = Math.min(a, Math.min(b, c));

        System.out.println("Największa liczba to: " + najwieksza);
        System.out.println("Najmniejsza liczba to: " + najmniejsza);

        System.out.print("Podaj wagę (kg): ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj wzrost (m): ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("waga prawidłowa");
        } else {
            System.out.println("nadwaga");
        }
        System.out.print("Podaj dochód: ");
        double dochod = scanner.nextDouble();
        double podatek;

        if (dochod <= 85528) {
            podatek = 0.18 * dochod - 556.02;
        } else {
            podatek = 14839.02 + 0.32 * (dochod - 85528);
        }

        if (podatek < 0) podatek = 0;

        System.out.println("Należny podatek: " + podatek + " zł");
    }
}