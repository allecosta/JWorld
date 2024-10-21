package edu.tutorialspoint.basic.date;

import java.util.*;

public class Date06 {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date() + "\n");

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Diferença: " + diff);

        } catch (Exception e) {
            System.out.println("OPS! Exception...");
        }
    }    
}
