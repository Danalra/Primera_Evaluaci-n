
public class H2Ej4 {
	//Que muestre los numeros pares que haya del 1 al 100
	public static void main(String[] args) {
		
		//Variables
		int num=0;
		int cont=0;
		
		while ((cont<100)&&(num % 2 == 0)) {
			cont=cont+2;
			System.out.println(cont);
		}

	}

}
