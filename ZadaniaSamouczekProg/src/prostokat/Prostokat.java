package prostokat;

import java.util.Scanner;

public class Prostokat {
    public static void main(String[] args) {
        PoleP poleP = new PoleP();
        ObwodP obwodP = new ObwodP();
        PrzekatnaP przekatnaP = new PrzekatnaP();

        Scanner s = new Scanner(System.in);
        System.out.println("Pole, Obwód, Przekatna prostokata dla podanych liczb a i b : ");
        System.out.println("Wczytaj bok a");
        double a = Double.parseDouble(s.nextLine());
        System.out.println("Wczytaj bok b");
        double b = Double.parseDouble(s.nextLine());
        System.out.println("Pole = " + poleP.pole(a, b));
        System.out.println("Obwod = " + obwodP.obwod(a, b));
        System.out.println("Przekątna = " + przekatnaP.przekatna(a, b));


    }
}
class PoleP{
    double pole (double a, double b){
        return a * b;
    }

}
class ObwodP{
    double obwod (double a, double b){
        return 2*a + 2*b;
    }

}
class PrzekatnaP{
    double przekatna (double a, double b){
        return Math.sqrt(a*a + b*b);
    }

}