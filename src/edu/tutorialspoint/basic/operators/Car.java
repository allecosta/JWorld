package edu.tutorialspoint.basic.operators;

class Vehicle {}

public class Car extends Vehicle {

   public static void main(String args[]) {

      Vehicle car = new Car();
      boolean result =  car instanceof Car;

      System.out.println(result); // true
   }
}