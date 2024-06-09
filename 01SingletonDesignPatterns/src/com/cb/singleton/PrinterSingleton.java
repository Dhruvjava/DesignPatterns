package com.cb.singleton;

public class PrinterSingleton {
//  Private Static Ref variable of class type
    private static PrinterSingleton INSTANCE;

//    Defining 0-param constructor to stop creating object from outside
    private PrinterSingleton(){
        System.out.println("0-param constructor");
    }

//    Static factory method having singleton logic
    public static PrinterSingleton getInstance(){
        if (INSTANCE == null)
            INSTANCE= new PrinterSingleton();
        return INSTANCE;
    }

    public void showMessage(){
        System.out.println("Singleton java class with minimum standards.");
    }

}
