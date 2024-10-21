package edu.tutorialspoint.basic.date;

import java.util.*;
import java.text.*;

public class Date02 {
    public static void main(String[] args) {
        Date dataNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy - hh:mm:ss z");

        System.out.println(ft.format(dataNow));
    }
}
