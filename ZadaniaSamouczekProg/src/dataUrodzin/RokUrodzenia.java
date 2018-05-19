package dataUrodzin;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class RokUrodzenia {

    public static void main(String[] args) {
        Calendar rokUrodzenia = new GregorianCalendar(1970, 11, 19);
        Calendar doDzis = new GregorianCalendar(2018, 05, 18);
        System.out.println(doDzis);
    }

}
