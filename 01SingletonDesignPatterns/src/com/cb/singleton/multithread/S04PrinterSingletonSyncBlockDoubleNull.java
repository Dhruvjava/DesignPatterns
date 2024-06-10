package com.cb.singleton.multithread;

public class S04PrinterSingletonSyncBlockDoubleNull {
    //  Private Static Ref variable of class type
    private static S04PrinterSingletonSyncBlockDoubleNull INSTANCE;

    //    Defining 0-param constructor to stop creating object from outside
    private S04PrinterSingletonSyncBlockDoubleNull() {
        System.out.println("0-param constructor");
    }

    //    Static factory method having singleton logic
    public static S04PrinterSingletonSyncBlockDoubleNull getInstance() {
        if (INSTANCE == null) { // First Null check to not entered multiple threads in synchronized block
            //      Synchronized block start having clas level lock
            synchronized (S04PrinterSingletonSyncBlockDoubleNull.class) {
                if (INSTANCE == null) { // if Condition start second Null check
                    try { // try block start
                        Thread.sleep(1000); // stoping thread
                    } catch (InterruptedException e) { // try block ends and catch block starts
                        e.printStackTrace();
                    } // catch block ends
                    INSTANCE = new S04PrinterSingletonSyncBlockDoubleNull();
                } // if condition end
            }
        }
        return INSTANCE;
    } // getInstance method ends

    public void showMessage() {
        System.out.println("Singleton java class with minimum standards.");
    }

}
