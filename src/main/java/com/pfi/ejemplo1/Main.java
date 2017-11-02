package com.pfi.ejemplo1;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Main {

	public static void main(String[] args) {
		PatternLayout patron = new PatternLayout("%m %n");
		ConsoleAppender consola = new ConsoleAppender(patron);
		Logger log = Logger.getLogger("miLog");
		log.addAppender(consola);
		log.info("Un Hola Mundo con log4j");
		log.info("en adelante se realizara");
		log.info("ejemplos de mas nivel"); 
	}
}
