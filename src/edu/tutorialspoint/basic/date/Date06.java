package edu.tutorialspoint.basic.date;

import java.util.*;

public class Date06 {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n"); // Mon Oct 21 15:01:21 BRT 2024
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n"); //Mon Oct 21 15:01:24 BRT 2024

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Diferença: " + diff); // Diferença: 3107

        } catch (Exception e) {
            System.out.println("OPS! Exception...");
        }
    }    
}
