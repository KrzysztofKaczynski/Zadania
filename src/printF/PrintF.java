package printF;

public class PrintF {
    public static void main(String[] args) {
        int wiek = 23;
        System.out.printf("Kuba ma %d lat \n", wiek);
        float waga = (float) 65.45678;
        System.out.printf("Kuba chciałby ważyć %f kg\n", waga);
        double wzrost = 175.123456789;
        System.out.printf("Kuba mierzy %e cm\n", wzrost);
        char plec = 'm';
        System.out.printf("Kuba jest %c\n", plec);
        String nazwisko = "Materac";
        System.out.printf("Kuba ma na nazwisko %s\n", nazwisko);
    }
}
