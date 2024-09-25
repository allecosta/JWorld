package edu.tutorialspoint.interfaces.set;

import java.util.Set;
import java.util.LinkedHashSet;

public class CollectionsLinkedHashSet {
    public static void main(String[] args) {
        double count[] = {34.5, 22.2, 10, 60.5, 30.2};
        
        Set<Double> s1 = new LinkedHashSet<>();

        try {
            for (int i = 0; i < 5; i++) {
                s1.add(count[i]);
            }

            System.out.println(s1);

            s1.remove(count[2]);

            System.out.println(s1);

        } catch (Exception e) {
            System.out.println("OPS! Error: " + e);
        }
    }
}
