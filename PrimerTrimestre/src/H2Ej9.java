
public class H2Ej9 {
	/*Que imprima la suma de todos los numeros pares que van del 1 al 100 
	y diga cuantos hay
	*/
	public static void main(String[] args) {
		// Declaracion de variables
		
		int numb=0;
		int suma=0;
		int contNumbPares=0;
		
		while (numb<100) {
			numb=numb+2;
			suma=suma+numb;
			contNumbPares=contNumbPares+1;
			System.out.println("numb:"+numb);
		}
		System.out.println("Hay: "+ numb +"," +suma);

	}

}
