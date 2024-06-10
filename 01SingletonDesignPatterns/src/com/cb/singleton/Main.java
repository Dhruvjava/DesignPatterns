package com.cb.singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PrinterSingleton p1 = PrinterSingleton.getInstance();
        PrinterSingleton p2 = PrinterSingleton.getInstance();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        p1.showMessage();
        p2.showMessage();
    }

}
