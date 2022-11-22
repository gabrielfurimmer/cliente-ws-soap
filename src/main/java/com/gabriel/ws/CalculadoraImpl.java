package com.gabriel.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.gabriel.ws.Calculadora")
public class CalculadoraImpl implements Calculadora{

	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		// TODO Auto-generated method stub
		double res = 0;
		switch (opcion) {
		case 1:
			res = valor1+valor2;
			break;
		case 2:
			res = valor1-valor2;
			break;
		case 3:
			res = valor1*valor2;
			break;
		case 4:
			res = valor1/valor2;
			break;
		}
		return res;
	}
	
}
