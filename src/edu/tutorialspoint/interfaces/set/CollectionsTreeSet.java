package edu.tutorialspoint.interfaces.set;

import java.util.Set;
import java.util.TreeSet;

public class CollectionsTreeSet {
    public static void main(String[] args) {
        String nfl[] = {"Giants", "Eagles", "Dallas", "Raiders"};

        Set<String> s1 = new TreeSet<>();

        try {
            for (int i = 0; i < 4; i++) {
                s1.add(nfl[i]);
            }

            System.out.println(s1);

            TreeSet<String> s2 = new TreeSet<>(s1);

            System.out.println("O primeiro time da NFL no set: " + s2.first());
            System.out.println("O último time da NFL no set: " + s2.last());

        } catch (Exception e) {
            System.out.println("OPS! Error: " + e);
        }
    }
}
