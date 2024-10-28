package edu.example;

public class User {
    
    public void setAge(String age) {
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("A idade deve ser um número inteiro!");
        }
    }
}
