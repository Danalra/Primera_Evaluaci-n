import java.util.Scanner;

public class Calculadorav3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;

        System.out.println("Calculadora Simple");
        System.out.print("Ingrese una expresión (ejemplo: 2 + 3): ");
        num1 = scanner.nextDouble();
        operador = scanner.next().charAt(0);
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = (num2 != 0) ? num1 / num2 : Double.NaN; break;
            default: resultado = Double.NaN;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
