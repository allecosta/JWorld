package edu.tutorialspoint.basic.variable;

/**
 * Examplo 2: Variável estática e constante
 * Variável estática são declaradas com o uso da palavra reservada "static"
 * O mesmo acontece com as contantes, porém usa-se a palavra reservada "final" e escreve em letras maiusculas
 * 
 */

public class Employee02 {
    private static double salary = 25.000;
    private static final String DEPARTAMENT = "Tecnologia da Informação";

    public static void main(String[] args) {
        System.out.println("Setor de trabalho: " + DEPARTAMENT);
        System.out.println("Salário: " + salary);
    }
}
