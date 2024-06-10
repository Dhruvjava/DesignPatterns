package com.cb.singleton.multithread;

public class S03PrinterSingletonSyncBlockSolution {
    //  Private Static Ref variable of class type
    private static S03PrinterSingletonSyncBlockSolution INSTANCE;

    //    Defining 0-param constructor to stop creating object from outside
    private S03PrinterSingletonSyncBlockSolution(){
        System.out.println("0-param constructor");
    }

    //    Static factory method having singleton logic
        public static S03PrinterSingletonSyncBlockSolution getInstance(){
//      Synchronized block start having clas level lock
        synchronized (S03PrinterSingletonSyncBlockSolution.class) {
            if (INSTANCE == null) { // if Condition start
                try { // try block start
                    Thread.sleep(1000); // stoping thread
                } catch (InterruptedException e) { // try block ends and catch block starts
                    e.printStackTrace();
                } // catch block ends
                INSTANCE = new S03PrinterSingletonSyncBlockSolution();
            } // if condition end
        }
        return INSTANCE;
    } // getInstance method ends

    public void showMessage(){
        System.out.println("Singleton java class with minimum standards.");
    }

}
