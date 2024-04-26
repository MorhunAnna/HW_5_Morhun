package org.example;

public class MainProgramm {
    public static void main(String[] args) {
        MyInt a1 = new MyInt(3);
        MyInt a2 = a1;
        System.out.println("First value of a1.x: " + a1.getInt());
        System.out.println("First value of a2.x: " + a2.getInt());

        a1.x = 5;
        System.out.println("Second value of a1.x: " + a1.getInt());
        System.out.println("Second value of a2.x: " + a2.getInt());
    }
}
