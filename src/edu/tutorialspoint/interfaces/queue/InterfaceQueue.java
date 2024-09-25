package edu.tutorialspoint.interfaces.queue;

import java.util.Queue;
import java.util.LinkedList;

public class InterfaceQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(12);
        q1.add(10);
        q1.add(16);
        q1.add(40);
        q1.add(70);

        System.out.println("A fila: " + q1);

        int number1 = q1.remove();

        System.out.println("O elemento excluido: " + number1);
        System.out.println("A fila: " + q1);

        int head = q1.peek();

        System.out.println("O cabeça da fila: " + head);

        int size = q1.size();

        System.out.println("O tamanho da fila: " + size);

    }
}
