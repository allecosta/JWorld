package edu.tutorialspoint.interfaces.map;

import java.util.Map;
import java.util.HashMap;

public class CollectionsHashMap {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(789, "Brasil");
        m1.put(781, "Argentina");
        m1.put(881, "Colombia");
        m1.put(882, "Uruguai");

        System.out.println("O código de País:");
        System.out.println("\t" + m1);

        String paisSelecionado = m1.get(781);

        System.out.println("País selecionado: " + paisSelecionado);

        String paisRemovido = m1.remove(789);

        System.out.println("País removido: " + paisRemovido);
    }
}
