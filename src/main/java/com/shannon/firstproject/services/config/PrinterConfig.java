package com.shannon.firstproject.services.config;

import com.shannon.firstproject.services.BluePrinter;
import com.shannon.firstproject.services.ColourPrinter;
import com.shannon.firstproject.services.GreenPrinter;
import com.shannon.firstproject.services.RedPrinter;
import com.shannon.firstproject.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter (){
        return new TagalogRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new TagalogGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new TagalogBluePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(bluePrinter, greenPrinter, redPrinter);
    }

}
