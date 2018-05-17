package czas;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Czas {
    public static void main(String[] args) {
        Date dzis = new Date();
        System.out.printf("%tc", dzis);
    }
}

