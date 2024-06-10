package com.cb.singleton.multithread;

import com.cb.singleton.PrinterSingleton;

public class S02PrinterSingletonSol {
    //  Private Static Ref variable of class type
    private static S02PrinterSingletonSol INSTANCE;

    //    Defining 0-param constructor to stop creating object from outside
    private S02PrinterSingletonSol(){
        System.out.println("0-param constructor");
    }

    //    Static factory method having singleton logic
    public synchronized static S02PrinterSingletonSol getInstance(){
        if (INSTANCE == null)
            INSTANCE= new S02PrinterSingletonSol();
        return INSTANCE;
    }

    public void showMessage(){
        System.out.println("Singleton java class with minimum standards.");
    }

}
