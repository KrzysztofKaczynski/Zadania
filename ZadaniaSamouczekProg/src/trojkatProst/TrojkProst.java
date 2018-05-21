package trojkatProst;

import java.util.Scanner;

public class TrojkProst {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Boki bokiT = new Boki();
        System.out.println("Wczytaj 1 liczbe: ");
        double a = Double.parseDouble(s.nextLine());
        System.out.println("Wczytaj 2 liczbe: ");
        double b = Double.parseDouble(s.nextLine());

        System.out.println("Trzeci bok trojkata prostokatnego wynosi: " + bokiT.bokC(a, b));



    }
}
class Boki{


    double bokA(double a){
        return a * a;
    }

    double bokB(double b){
        return b * b;
    }

    double bokC(double a, double b){

        return Math.sqrt((a*a) + (b*b));
    }

    double test(double bokC){
        double c = 2;
        return Math.pow(bokC, c);
    }
}
