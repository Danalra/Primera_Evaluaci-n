import java.util.Scanner;

public class LeerTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce número 1");
		
		// Leer num1
		
		System.out.println("Introduce número 2");
		
		// Leer num2
		
		num2=entrada.nextInt();
		
		System.out.println("La suma es:"+(num1+num2));
	}

}
