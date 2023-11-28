package ud3;

import java.util.Scanner;

// Calculadora que permita (S) sumar, (R) restar, (M) multiplicar,
// (D) dividir (X) Dos numeros 
public class CalculadoraConFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Variables

		double num1 = 0, num2 = 0, resultado;

		char opcion = 0;

		// double S = false;

		System.out.println("*****Calculadora de Daniel Alvarez Ramirez*****");

		// Menu para que el usuario decida que operación realizar

		System.out.print("Que operacion desea hacer? (S, R, M, D, X): ");
		opcion = scanner.next().charAt(0);

		switch (opcion) {

		case 'S':
			System.out.println("Introduzca el primer numero");
			num1 = scanner.nextDouble(); // Leemos
			System.out.println("Introduzca el segundo numero");
			num2 = scanner.nextDouble();
			resultado = num1 + num2;
			System.out.println("Resultado: " + resultado);

			// op1 + op2 "Para llamarlo directamente"

			break;

		case 'R':
			System.out.println("Introduzca el primer numero");
			num1 = scanner.nextDouble();
			System.out.println("Introduzca el segundo numero");
			num2 = scanner.nextDouble();
			resultado = num1 - num2;
			System.out.println("Resultado: " + resultado);

			break;

		case 'M':
			System.out.println("Introduzca el primer numero");
			num1 = scanner.nextDouble();
			System.out.println("Introduzca el segundo numero");
			num2 = scanner.nextDouble();
			resultado = num1 * num2;
			System.out.println("Resultado: " + resultado);

			break;

		case 'D':
			System.out.println("Introduzca el primer numero");
			num1 = scanner.nextDouble();
			System.out.println("Introduzca el segundo numero");
			num2 = scanner.nextDouble();
			resultado = num1 / num2;
			System.out.println("Resultado: " + resultado);
			break;

		case 'X':
			System.out.println("***Programa finalizado***");
			break;

		}

	}
}
