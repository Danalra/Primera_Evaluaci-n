
public class fibonacci {

	public static void main(String[] args) {
		// Variables
		
		int a=0;
		int b=1;
		int c;
		int cont=1;
		
		// Mostramos los dos primeros terminos de la serie
		
		System.out.println(a);
		System.out.println(b);
		
		while (cont<=25) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;	
			cont=cont+1;
		}

	}

}
