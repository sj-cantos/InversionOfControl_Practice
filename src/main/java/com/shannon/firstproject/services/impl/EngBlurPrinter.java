package com.shannon.firstproject.services.impl;

import com.shannon.firstproject.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EngBlurPrinter implements BluePrinter {
    @Override
    public String print() {
        return "blue";
    }
}
