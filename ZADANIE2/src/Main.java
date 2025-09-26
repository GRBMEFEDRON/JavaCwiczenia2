import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nWybierz zadanie (1-7) lub 0 by wyjść:");
            int wybor = sc.nextInt();

            if (wybor == 0) break;

            switch (wybor) {
                case 1 -> {
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i += 2) System.out.print(i + " ");
                }
                case 2 -> {
                    int a = sc.nextInt(), b = sc.nextInt();
                    int s1 = 0, i = a;
                    while (i <= b) s1 += i++;
                    System.out.println(s1);
                    int s2 = 0; i = a;
                    do s2 += i++; while (i <= b);
                    System.out.println(s2);
                    int s3 = 0;
                    for (i = a; i <= b; i++) s3 += i;
                    System.out.println(s3);
                }
                case 3 -> {
                    int n = sc.nextInt(), p = 1;
                    while (p <= n) {
                        System.out.println(p);
                        p *= 2;
                    }
                }
                case 4 -> {
                    int suma = 0, x;
                    do {
                        x = sc.nextInt();
                        suma += x;
                    } while (x != 0);
                    System.out.println(suma);
                }
                case 5 -> {
                    int x, suma = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, count = 0;
                    while ((x = sc.nextInt()) != 0) {
                        if (x < min) min = x;
                        if (x > max) max = x;
                        suma += x;
                        count++;
                    }
                    if (count > 0) {
                        System.out.println(min + max);
                        System.out.println(suma / (double) count);
                    }
                }
                case 6 -> {
                    int secret = new Random().nextInt(100) + 1, guess;
                    do {
                        guess = sc.nextInt();
                        if (guess > secret) System.out.println("Za dużo");
                        else if (guess < secret) System.out.println("Za mało");
                        else System.out.println("Gratulacje!");
                    } while (guess != secret);
                }
                case 7 -> {
                    char z = sc.next().charAt(0);
                    int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
                    for (int i = 1; i < y; i++) System.out.println();
                    for (int i = 0; i < a; i++) {
                        System.out.print(" ".repeat(x - 1));
                        System.out.println(String.valueOf(z).repeat(b));
                    }
                }
                default -> System.out.println("Nieprawidłowy wybór.");
            }
        }
    }
}
