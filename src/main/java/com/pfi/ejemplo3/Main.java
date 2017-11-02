package com.pfi.ejemplo3;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Un Hola Mundo con log4j.properties");
		log.error("en adelante se realizara");
		log.debug("ejemplos de mas nivel");
	}

}
