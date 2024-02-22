package com.shannon.firstproject.services.impl;

import com.shannon.firstproject.services.BluePrinter;
import com.shannon.firstproject.services.ColourPrinter;
import com.shannon.firstproject.services.GreenPrinter;
import com.shannon.firstproject.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;
    private RedPrinter redPrinter;

    public ColourPrinterImpl (BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter){
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
    }

    @Override
    public String print(){
        return String.join(", ", bluePrinter.print(), greenPrinter.print(), redPrinter.print());
    }

}
