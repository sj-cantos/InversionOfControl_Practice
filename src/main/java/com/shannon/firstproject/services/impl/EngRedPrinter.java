package com.shannon.firstproject.services.impl;

import com.shannon.firstproject.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EngRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "red";
    }
}
