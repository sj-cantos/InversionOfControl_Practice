package com.shannon.firstproject.services.impl;

import com.shannon.firstproject.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EngGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "green";
    }
}
