package ud3;

import java.util.Scanner;

public class del0al100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

		public class del0al10 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int numero;

		        while (true) {
		            try {
		                System.out.print("Por favor, ingresa un número entre 0 y 100: ");
		                numero = scanner.nextInt();
		                if (numero >= 0 && numero <= 100) {
		                    System.out.println("¡Has ingresado un número válido!");
		                    break;
		                } else {
		                    System.out.println("El número debe estar entre 0 y 100. Inténtalo de nuevo.");
		                }
		            } catch (java.util.InputMismatchException e) {
		                System.out.println("Por favor, ingresa un número válido.");
		                scanner.nextLine();  // Limpia el búfer del teclado
		            }
		        }
		        scanner.close();
		    }
		}

	}

}
