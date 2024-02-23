package com.shannon.firstproject.services.impl;

import com.shannon.firstproject.services.GreenPrinter;
import org.springframework.stereotype.Component;


public class TagalogGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "berde";
    }
}
