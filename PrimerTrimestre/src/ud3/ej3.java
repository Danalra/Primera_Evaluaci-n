package ud3;

import java.util.Scanner;

// Que pida los numeros entre el 0 y el 100
public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		int numero=101;

        while (true) {
            try {
                System.out.print("Por favor, ingresa un número entre 0 y 100: ");
                
                if (numero >= 0 && numero <= 100) {
                    System.out.println("¡Has ingresado un número válido!");
                    break;
                } else {
                    System.out.println("El número debe estar entre 0 y 100. Inténtalo de nuevo.");
                }
            } 
               
        
	
            }
		
		}
	}

