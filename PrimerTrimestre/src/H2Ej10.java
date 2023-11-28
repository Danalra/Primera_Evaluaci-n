
public class H2Ej10 {
// Que imprima la suma de todos los numeros impares que van del 1 al 100 y diga cuantos hay
	public static void main(String[] args) {
		// Variable
		int i;
		int suma=0;
		int cont=0;
		
		for (i=1;i<=99;i=i+2) {
			System.out.println(i);
			suma=suma+i;
			cont=cont+1;
		}
		System.out.println("suma"+suma+" cont:"+cont);

	}

}
