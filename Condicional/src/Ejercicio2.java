import java.util.Scanner;

/**
 * 2. Algoritmo que pida tres n�meros distintos de tipo float e indique cual es el que ocupa la 
posici�n central si los tres se ordenasen. 

 * @author Manuel L�pez
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		int num1 = teclado.nextInt();
	
		System.out.println("Introduce otro n�mero: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce otro n�mero: ");
		int num3 = teclado.nextInt();
		
		if (((num1 > num2) && (num1<num3)) || ((num1 > num3) && (num1<num2))){
				System.out.println("el n�nero central es "+num1);
		
		} else if (((num2 > num1) && (num2<num3)) || ((num2 > num3) && (num2<num1))){
			    System.out.println("el n�nero central es "+num2);
		} else {
				System.out.println("el n�mero central es "+num3);
		}
	}
}
