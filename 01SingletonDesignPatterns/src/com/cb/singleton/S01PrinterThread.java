package com.cb.singleton;

public class S01PrinterThread {

    public static void main(String[] args) {
        Runnable runnable = ()-> {
            System.out.println("S01PrinterThread.run() -> ");
            PrinterSingleton printer = null;
            try {
                printer = PrinterSingleton.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            System.out.println(printer.hashCode());
        };
        Thread thread1 =  new Thread(runnable);
        Thread thread2 =  new Thread(runnable);
        Thread thread3 =  new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
