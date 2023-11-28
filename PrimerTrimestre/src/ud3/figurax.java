package ud3;

import java.util.Scanner;

public class figurax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		// Variables
		int filasLeidas, filaCont=1, numAst=1;
		
		System.out.println("Introduce el numero de filas");
		
		filasLeidas = entrada.nextInt();
		
		// Recorremos filas
		for (filaCont = 1; filaCont <= filasLeidas;filaCont++) {
		// Pintamos los asteriscos
			for (numAst =1; numAst <= filaCont; numAst++) {
				System.out.print('*');
	}
				System.out.println();
		}
}
}