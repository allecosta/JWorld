package edu.tutorialspoint.interfaces.set;

import java.util.Set;
import java.util.HashSet;

public class CollectionsHashSet {
    public static void main(String[] args) {
        int count[] = {4, 2, 10, 6, 3, 22};

        Set<Integer> s1 = new HashSet<>();

        try {
            for (int i = 0; i < 5; i++) {
                s1.add(count[i]);
            }

            System.out.println(s1);

        } catch (Exception e) {
            System.out.println("OPS! Error: " + e);
        }
    }
}
