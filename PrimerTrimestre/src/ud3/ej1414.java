package ud3;

import java.util.Scanner;

// Que rellene un array con 20 números y luego busque un número concreto
public class ej1414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Constantes
		final int TAMANO=5;
		
		// Declaración
		Scanner entrada=new Scanner(System.in);
		int[] numeros=new int [TAMANO];
		int posicion=0;
		int numBuscado=0;
		boolean numEncontrado=false;
		// Que rellene un array con numeros
		for(int i=0;i<TAMANO;i++) {
			System.out.println("Introduce un numero");
			numeros[i]=entrada.nextInt();
		}
		// Pedimos un numero
		System.out.println("Introduce el numero a buscar");
		numBuscado=entrada.nextInt();
		for (int i=0;i<TAMANO;i++) {
			if (numBuscado==numeros[i]&&(numEncontrado==false))
			System.out.println("La posicion del numero es "+ (i+1));
			numEncontrado=true;
			{
				
			}
		}
	}

}
