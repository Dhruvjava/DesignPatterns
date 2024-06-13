package com.cb.singleton.cloning;

import com.cb.singleton.common.CommonsUtils;
import com.cb.singleton.multithread.S02PrinterSingletonSol;
import com.cb.singleton.multithread.S04PrinterSingletonSyncBlockDoubleNull;

public class S01PrinterSingletonMarkerInterface extends CommonsUtils {
    //  Private Static Ref variable of class type
    private static S01PrinterSingletonMarkerInterface INSTANCE;

    //    Defining 0-param constructor to stop creating object from outside
    private S01PrinterSingletonMarkerInterface(){
        System.out.println("0-param constructor");
    }

    //    Static factory method having singleton logic
    public static S01PrinterSingletonMarkerInterface getInstance() {
        if (INSTANCE == null) { // First Null check to not entered multiple threads in synchronized block
            //      Synchronized block start having clas level lock
            synchronized (S04PrinterSingletonSyncBlockDoubleNull.class) {
                if (INSTANCE == null) { // if Condition start second Null check
                    try { // try block start
                        Thread.sleep(1000); // stoping thread
                    } catch (InterruptedException e) { // try block ends and catch block starts
                        e.printStackTrace();
                    } // catch block ends
                    INSTANCE = new S01PrinterSingletonMarkerInterface();
                } // if condition end
            }
        }
        return INSTANCE;
    } // getInstance method ends

    /*@Override
    public Object clone() throws CloneNotSupportedException {
        return INSTANCE;
    }*/

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(S01PrinterSingletonMarkerInterface.class +"class is not supporting cloning");
    }

    public void showMessage(){
        System.out.println("Singleton java class with minimum standards.");
    }

}
