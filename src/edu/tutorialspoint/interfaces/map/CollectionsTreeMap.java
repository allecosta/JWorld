package edu.tutorialspoint.interfaces.map;

import java.util.Map;
import java.util.TreeMap;

public class CollectionsTreeMap {
    public static void main(String[] args) {
        Map<String, String> m1 = new TreeMap<>();
        m1.put("Nubank", "8");
        m1.put("c6 Bank", "31");
        m1.put("Stone", "12");
        m1.put("PicPay", "14");

        System.out.println("Banco Digitais:");
        System.out.println("\t" + m1);
    }
}
