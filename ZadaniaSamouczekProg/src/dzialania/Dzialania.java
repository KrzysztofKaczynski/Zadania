package dzialania;

import java.util.Scanner;

public class Dzialania {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Wczytaj 1 liczbe: ");
        double liczba1 = Double.parseDouble(s.nextLine());
        System.out.println("Wczytaj 2 liczbe: ");
        double liczba2 = Double.parseDouble(s.nextLine());

        System.out.println("+ : " + kalkulator.dodawanie(liczba1, liczba2));
        System.out.println("- : " + kalkulator.odejmowanie(liczba1, liczba2));
        System.out.println("* : " + kalkulator.mnozenie(liczba1, liczba2));
        System.out.println("// : " + kalkulator.dzielenie(liczba1, liczba2));
        System.out.println("pow : " + kalkulator.power(liczba1, liczba2));
        System.out.println("sqrt : " + kalkulator.sqrt(liczba1));
        System.out.println("pow^3 : " + kalkulator.power3(liczba1, 3));
        s.close();


    }

}

class Kalkulator {

    double dodawanie(double liczba1, double liczba2) {
        return liczba1 + liczba2;

    }

    double odejmowanie(double liczba1, double liczba2) {
        return liczba1 - liczba2;
    }

    double mnozenie(double liczba1, double liczba2) {
        return liczba1 * liczba2;
    }

    double dzielenie(double liczba1, double liczba2) {
        return liczba1 / liczba2;
    }

    double power(double liczba1, double liczba2) {
        return Math.pow(liczba1, liczba2);
    }

    double sqrt(double liczba1) {
        return Math.sqrt(liczba1);
    }


    double power3(double liczba1, double v) {
        v = 3;
        return Math.pow(liczba1, v);
    }
}
