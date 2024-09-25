package edu.tutorialspoint.interfaces.list;

import java.util.List;
import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();
        l1.add("Sergipe");
        l1.add("Itabaiana");
        l1.add("Confiança");

        System.out.println("Clubes Sergipanos:");
        System.out.print("\t" + l1);
    }
}
