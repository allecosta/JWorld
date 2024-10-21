package edu.tutorialspoint.basic.date;

import java.util.Date;

public class Date03 {
    public static void main(String[] args) {
        Date date = new Date();
        String str = String.format("Data/hora: %tc", date);

        System.out.printf(str); // Data/hora: Mon Oct 21 10:06:05 BRT 2024
        System.out.println();
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Date de vencimento: ", date); // Date de vencimento:  October 21, 2024
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY", "Date de vencimento: ", date); // Date de vencimento:  October 21, 2024
        System.out.println();
        System.out.printf("%1$s %2$tB %2$tD", "Date de vencimento: ", date); // Date de vencimento:  October 10/21/24
    }
}
