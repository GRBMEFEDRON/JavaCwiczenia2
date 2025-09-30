import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zadanie 1
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) System.out.print(i + " ");
        System.out.println();

        // Zadanie 2
        int a = sc.nextInt(), b = sc.nextInt(), s = 0;
        int i = a;
        while (i <= b) s += i++;
        System.out.println(s);
        i = a; s = 0;
        do { s += i++; } while (i <= b);
        System.out.println(s);
        s = 0;
        for (i = a; i <= b; i++) s += i;
        System.out.println(s);

        // Zadanie 3
        int p = 1;
        int n3 = sc.nextInt();
        while (p <= n3) {
            System.out.println(p);
            p *= 2;
        }

        // Zadanie 4
        int x, sum = 0;
        do {
            x = sc.nextInt();
            sum += x;
        } while (x != 0);
        System.out.println(sum);

        // Zadanie 5
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, count = 0, suma = 0;
        do {
            x = sc.nextInt();
            if (x != 0) {
                if (x < min) min = x;
                if (x > max) max = x;
                suma += x; count++;
            }
        } while (x != 0);
        System.out.println(min + max);
        System.out.println((double)suma / count);

        // Zadanie 6
        int sek = new Random().nextInt(100) + 1, guess;
        do {
            guess = sc.nextInt();
            if (guess > sek) System.out.println("Za dużo");
            else if (guess < sek) System.out.println("Za mało");
        } while (guess != sek);
        System.out.println("Gratulacje");

        // Zadanie 7
        char z = sc.next().charAt(0);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), a1 = sc.nextInt(), b1 = sc.nextInt();
        for (int j = 1; j < y1; j++) System.out.println();
        for (int j = 0; j < a1; j++) {
            for (int k = 1; k < x1; k++) System.out.print(" ");
            for (int k = 0; k < b1; k++) System.out.print(z);
            System.out.println();
        }

        // Zadanie 8
        int wys = sc.nextInt();
        for (int j = 0; j < wys; j++) {
            for (int k = 0; k < wys - j - 1; k++) System.out.print(" ");
            for (int k = 0; k < 2 * j + 1; k++) System.out.print("*");
            System.out.println();
        }

        // Zadanie 9
        int n9 = Math.abs(sc.nextInt()), s9 = 0, sp = 0, sn = 0, cp = 0, cn = 0;
        while (n9 > 0) {
            int d = n9 % 10;
            s9 += d;
            if (d % 2 == 0) { sp += d; cp++; }
            else { sn += d; cn++; }
            n9 /= 10;
        }
        System.out.println(s9);
        double avgP = cp > 0 ? (double)sp / cp : 0;
        double avgN = cn > 0 ? (double)sn / cn : 1;
        System.out.println(avgP / avgN);
    }
}dwa
