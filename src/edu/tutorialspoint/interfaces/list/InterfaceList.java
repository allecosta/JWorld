package edu.tutorialspoint.interfaces.list;

import java.util.List;
import java.util.ArrayList;

public class InterfaceList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(0, 20);
        list1.add(1, 30);

        System.out.println("Lista 1: " + list1);

        list1.remove(0);

        System.out.println("Lista 1: " + list1);
        System.out.println("Lista 1: " + list1.get(0));

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(10);
        list2.add(20);

        System.out.println("Lista 2: " + list2);

        list2.set(0, 100);

        System.out.println("Lista 2: " + list2);
    }
}
