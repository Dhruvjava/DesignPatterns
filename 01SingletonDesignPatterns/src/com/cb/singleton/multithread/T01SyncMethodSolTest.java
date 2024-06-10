package com.cb.singleton.multithread;

public class T01SyncMethodSolTest {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("T01SyncMethodSolTest.main");
            S02PrinterSingletonSol printer = S02PrinterSingletonSol.getInstance();
            System.out.println(printer.hashCode());
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
