package edu.tutorialspoint.basic.date;

import java.util.*;

public class Date05 {
    public static void main(String[] args) {
        try {
            System.out.println(new Date() + "\n"); // Mon Oct 21 14:59:49 BRT 2024
            Thread.sleep(5 * 60 * 10); 
            System.out.println(new Date() + "\n"); // Mon Oct 21 14:59:52 BRT 2024
        } catch (Exception e) {
            System.out.println("OPS! Exception...");
        }
    }
}
