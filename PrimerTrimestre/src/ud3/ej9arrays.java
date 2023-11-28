package ud3;

import java.util.Scanner;

// Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y
// muestre el segundo array
public class ej9arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un arreglo para almacenar los números ingresados.
        int[] numeros = new int[5];
        
        // Crear un segundo arreglo para almacenar los números multiplicados por 2.
        int[] numerosMultiplicados = new int[5];
        
        // Crear un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);
        
        // Leer 5 números por teclado y guardarlos en el primer arreglo.
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Multiplicar cada número por 2 y almacenarlos en el segundo arreglo.
        for (int i = 0; i < 5; i++) {
            numerosMultiplicados[i] = numeros[i] * 2;
        }
        
        // Mostrar el segundo arreglo con los números multiplicados por 2.
        System.out.println("Números multiplicados por 2:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numerosMultiplicados[i]);	
	}
	}
}
