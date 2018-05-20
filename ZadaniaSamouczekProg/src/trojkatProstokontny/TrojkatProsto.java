package trojkatProstokontny;

import java.util.Scanner;

public class TrojkatProsto {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Boki bokiT = new Boki();

        System.out.println("Sprawdz czy liczby tworzą trójkąt prostokątny? ");
        System.out.println("Wczytaj pierwszą liczbę: ");

        int a = Integer.parseInt(s.nextLine());

        System.out.println("Wczytaj drugą liczbę: ");

        int b = Integer.parseInt(s.nextLine());

        System.out.println("Wczytaj trzecią liczbę: ");

        int c = Integer.parseInt(s.nextLine());

        if ((bokiT.bokA(a) + bokiT.bokB(b)) == bokiT.bokC(c)) {

            System.out.println("Liczby tworzą trójkąt prostokątny ");

        } else {

            System.out.println("Liczby nie tworzą trójkąta prostokątnego! ");
        }
    }
}

class Boki {

    int bokA(int a) {
        return a * a;
    }

    int bokB(int b) {
        return b * b;
    }

    int bokC(int c) {
        return c * c;
    }

}