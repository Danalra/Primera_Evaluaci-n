import java.util.Scanner;
// Calcular la media entre 10 números
public class H2Ej22Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Habilitamos la entrada por teclado
		
		Scanner entrada=new Scanner(System.in);
		
		// Declaración variables
		
		int i,num;
		double media=0,suma=0;
		
		for (i=1;i<=3;i++) {
			System.out.println("Introduce un numero");
			
			// Leer numero
			
			num=entrada.nextInt();
			
			suma=suma+num;
		}
		media=suma/3;
		System.out.println("La media es:"+media);
	}
		

}
