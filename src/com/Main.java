package com;

public class Main implements Cloneable {
    int i;

    public static void main(String[] args) throws CloneNotSupportedException {
        Main main = new Main();
        main.i = 5;
        Main clone = (Main) main.clone();
        System.out.println(clone.i);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
