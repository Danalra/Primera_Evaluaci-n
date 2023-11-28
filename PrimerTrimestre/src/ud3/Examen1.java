
import java.util.Scanner;
public class Examen1 {
	
	int numero;
	int faltante;
	int numeroInvertido;
	int restante;
	
	public void numeroCapicua() {	
	
		Scanner num=new Scanner(System.in);
		
		System.out.println("\n Digite un numero:\n");
        numero=num.nextInt();
		
		faltante=numero;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		
		}
		
	    if(numeroInvertido==numero){
			
        System.out.println("\n El numero es capicua\n");
        
		}else{
       
        System.out.println("\n El numero no es capicua\n");
		
		}
		
		}
	
	public static void main(String args []) {
		
		Capicua capicua=new Capicua();
		capicua.numeroCapicua();
		
	}

}