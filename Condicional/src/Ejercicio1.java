import java.util.Scanner;

/**
 * 1. Algoritmo que pida dos enteros y que indique el mayor y el menor, o si ambos son 
iguales. 
 * @author Manuel López
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = teclado.nextInt();
	
		System.out.println("Introduce otro número: ");
		int num2 = teclado.nextInt();
		
		if (num1==num2) {
			System.out.println("Los números son iguales.");

		} else if (num1<num2) {
			System.out.println("El menor es "+num1+" y el mayor es "+num2);	
		} else {
			System.out.println("El menor es "+num2+" y el mayor es "+num1);	
		}
	}
}