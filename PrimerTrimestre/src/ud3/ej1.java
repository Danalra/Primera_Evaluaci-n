package ud3;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		numeros = new int [50];
		int num = 2;
		for (int i = 0; i < 50;i++) {
			numeros[i]=num;
			num = num +2;
		}
		//3 Leer el array
		for (int i = 0; i < 50;i++) {
			System.out.println(numeros[i]);
		}
	}

}
