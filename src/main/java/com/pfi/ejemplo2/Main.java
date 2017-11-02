package com.pfi.ejemplo2;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Main {

	private static PatternLayout patron;
	private static ConsoleAppender consola;
	private static Logger log;
	
	public static void main(String[] args) {
		double precio = calcularCosto(3000);
		log.debug("El precio es: " + precio);
	}

	public static double calcularCosto(double precio) {
		
		patron = new PatternLayout("%m %n");
		consola = new ConsoleAppender(patron);
		log = Logger.getLogger("miLog");
		log.addAppender(consola);
		log.setLevel(Level.ALL);
		
		log.info("Entramos en la funcion");
		if(precio < 0) {
			log.warn("El precio no puede ser negativo");
			throw new RuntimeException("El precio no puede ser negativo");
		}else {
			
			if(precio > 0 && precio < 1000) {
				log.info("Compra con el 20% de descuento");
				return precio*0.8;
			}else {
				log.info("Compra con el 50% de descuento");
				return precio*0.5;
			}
		}
	}
}
