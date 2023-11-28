
public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anyo;
		double sueldo;
		
		//Inicializar las variables
		anyo=0;
		sueldo=0;
		
		System.out.println("Introduce sueldo y antiguedad");
		
		//emular lectura
		
		anyo=3;
		sueldo=40000;
		
		// Si la antiguedad es mayor a 10
		if (anyo>10)
			sueldo=sueldo*1.1; 
		{
		if ((anyo<10)&&(anyo>5))
			sueldo=sueldo*1.05*sueldo;
		}
		if ((anyo<=5)&&(anyo>3)) {
			sueldo=1.05*sueldo;
		}
		if ((anyo<=3)&&(anyo>0))
			sueldo=1.03*sueldo;
		System.out.println("El sueldo es "+sueldo);
	}

}
