package com.util;

/**
 * @author sunke
 * @DATE 2021/12/13
 **/
public class Flower {
    private int petalCount = 0;
    private String s = new String("null");
    Flower(int petals) {
        petalCount = petals;
        System.out.println("petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("s=" + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);

        this.s = s;
        System.out.println("String & int args");
    }
    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }
    void print() {
        System.out.println("petalCount = " + petalCount + " s = "+ s);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }
}
