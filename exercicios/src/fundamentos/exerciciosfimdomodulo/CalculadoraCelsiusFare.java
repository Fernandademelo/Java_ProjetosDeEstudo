package fundamentos.exerciciosfimdomodulo;

import java.util.Scanner;

public class CalculadoraCelsiusFare {
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Celsius e converta para
		// Fahrenheit.
		// °F = °C × 1,8 + 32

		Scanner entrada = new Scanner(System.in);

		System.out.print("Indique a temperatura em Celsius : ");

		double tempC = entrada.nextDouble();
		double tempF = tempC * 1.8 + 32;

		entrada.close();

		System.out.printf("A Temperatura em Farenheit é %.2f", tempF);
	}
}