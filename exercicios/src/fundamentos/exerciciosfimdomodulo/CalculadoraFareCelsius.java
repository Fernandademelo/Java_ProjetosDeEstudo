package fundamentos.exerciciosfimdomodulo;

import java.util.Scanner;

public class CalculadoraFareCelsius {
	public static void main(String[] args) {
//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		// °C = (°F - 32)/1,8

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indique a temperatura em Farenheit : ");

		double tempF = entrada.nextDouble();
		double tempC = (tempF - 32) / 1.8;

		entrada.close();

		System.out.printf("A Temperatura em Celsius é %.2f", tempC);
	
	}
}
