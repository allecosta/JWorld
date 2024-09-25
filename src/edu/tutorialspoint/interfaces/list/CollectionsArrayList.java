package edu.tutorialspoint.interfaces.list;

import java.util.List;
import java.util.ArrayList;

public class CollectionsArrayList {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Nubank");
        l1.add("Stone");
        l1.add("c6 Bank");
        l1.add("PicPay");

        System.out.println("Bancos Digitais: ");
        System.out.println("\t" + l1);

        //l1.indexOf(2);

        l1.remove(1);

        System.out.println("Removendo o elemento 1 da lista: ");
        System.out.print("\t" + l1);
    }
}
