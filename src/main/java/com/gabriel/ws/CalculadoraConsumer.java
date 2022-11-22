package com.gabriel.ws;

public class CalculadoraConsumer {

	public static void main(String[] args) {
		CalculadoraImplService calculadoraservice = new CalculadoraImplService();
		Calculadora consumer = calculadoraservice.getCalculadoraImplPort();
		
		System.out.println("Suma");
		System.out.println(consumer.operacion(1, 2, 3));
		
		System.out.println("Resta");
		System.out.println(consumer.operacion(2, 5, 1));
		
		System.out.println("Multiplicacion");
		System.out.println(consumer.operacion(3, 6, 3));
		
		System.out.println("Division");
		System.out.println(consumer.operacion(4, 16, 8));
	}
	
}
