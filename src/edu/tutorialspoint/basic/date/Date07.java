package edu.tutorialspoint.basic.date;

import java.util.*;

public class Date07 {
    public static void main(String[] args) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        String[] months = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        int year  = gCalendar.get(Calendar.YEAR);

        System.out.print("Data: ");
        System.out.print(months[gCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gCalendar.get(Calendar.DATE) + " ");
        System.out.println(year);

        System.out.print("Hora: ");
        System.out.print(gCalendar.get(Calendar.HOUR) + ":");
        System.out.print(gCalendar.get(Calendar.MINUTE) + ":");
        System.err.println(gCalendar.get(Calendar.SECOND));

        if (gCalendar.isLeapYear(year)) {
            System.out.println("O ano atual é um ano bissexto");
        } else {
            System.out.println("O ano atual não é um ano bissexto");
        }
    }
}
