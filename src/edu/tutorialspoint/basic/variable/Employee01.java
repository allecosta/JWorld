package edu.tutorialspoint.basic.variable;

public class Employee01 {
    private String name;
    private double salary;

    public Employee01(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmp() {
        System.out.println("Nome: " + name);
        System.out.println("Salário: " + salary);
    }

    public static void main(String[] args) {
        Employee01 employe = new Employee01("João");
        employe.setSalary(25.610);
        employe.printEmp();
    }
}
