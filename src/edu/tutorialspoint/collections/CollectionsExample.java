package edu.tutorialspoint.collections;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        // ArrayList
        List l1 = new ArrayList();
        l1.add("José");
        l1.add("Mônica");
        l1.add("Eduardo");

        System.out.println("ArrayList:");
        System.out.println("\t" + l1);

        // LinkedList
        List l2 = new LinkedList();
        l2.add("C3PO");
        l2.add("BB8");
        l2.add("Yoda");

        System.out.println("LinkedList:");
        System.out.println("\t" + l2);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Rey");
        s1.add("Kylo Ren");
        s1.add("Anakin");

        System.out.println("HashSet:");
        System.out.println("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Eli Manning", 10);
        m1.put("Tom Brady", 12);
        m1.put("Brees", 9);
        m1.put("Aaron Rodgers", 12);

        System.out.println("HashMap:");
        System.out.println("\t" + m1);

    }

}
