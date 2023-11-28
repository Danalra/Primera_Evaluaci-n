package ud3;

public class h1ej25 {
//25. Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra
//	40.000 euros anuales, el programa debe realizar los cálculos en función de los
//	siguientes criterios:
//	a. Si lleva más de 10 años en la empresa se le aplica un aumento del 10%.
//	b. Si lleva menos de 10 años pero más que 5 se le aplica un aumento del 7%.
//	c. Si lleva menos de 5 años pero más que 3 se le aplica un aumento del 5%.
//	d. Si lleva menos de 3 años se le aplica un aumento del 3%.
	public static void main(String[] args) {
		//Variables
		double anos;
		anos=0;
		
		double sueldo;
		sueldo=40000;
		
		
		//Pedir al usuario el tiempo de antiguedad
		
		System.out.println("Cuantos años lleva en la empresa?");
		if (anos>=10) {
			sueldo=sueldo*0.03+sueldo;
		}
		else if ((anos<=10)&&(anos>=5)) {
			System.out.println("Le corresponde un aumento del 7%");
			}

	}

}
