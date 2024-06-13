package com.cb.singleton.cloning;

import com.cb.singleton.common.CommonsUtils;

import java.util.Objects;

public class S01PrinterSingletonMarkerInterfaceTests{

    public static void main(String[] args) throws CloneNotSupportedException {
        S01PrinterSingletonMarkerInterface printer = S01PrinterSingletonMarkerInterface.getInstance();
        S01PrinterSingletonMarkerInterface printer2 = (S01PrinterSingletonMarkerInterface) printer.clone();
        System.out.println(printer.hashCode()+ " "+printer2.hashCode());
        printer.showMessage();
        printer2.showMessage();
    }

}
