package com.shannon.firstproject;

import com.shannon.firstproject.services.ColourPrinter;
import com.shannon.firstproject.services.impl.ColourPrinterImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class FirstprojectApplication implements CommandLineRunner{

	private ColourPrinter colourPrinter;

	public FirstprojectApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	@Override
	public void run(final String... args) {
		log.info(colourPrinter.print());
	}

}
