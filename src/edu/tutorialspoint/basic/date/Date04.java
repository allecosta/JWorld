package edu.tutorialspoint.basic.date;

import java.util.*;
import java.text.*;

public class Date04 {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String input = args.length == 0 ? "21-10-2024" : args[0];

        System.out.println(input); // 21-10-2024

        Date time;

        try {
            time = ft.parse(input);
            System.out.println(time); // Mon Oct 21 00:00:00 BRT 2024
        } catch (ParseException e) {
            System.out.println(ft);
        }
    }
}
