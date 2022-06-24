import java.util.Scanner;

/**
 * 2. Algoritmo que pida tres números distintos de tipo float e indique cual es el que ocupa la 
posición central si los tres se ordenasen. 

 * @author Manuel López
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = teclado.nextInt();
	
		System.out.println("Introduce otro número: ");
		int num2 = teclado.nextInt();
		
		System.out.println("Introduce otro número: ");
		int num3 = teclado.nextInt();
		
		if (((num1 > num2) && (num1<num3)) || ((num1 > num3) && (num1<num2))){
				System.out.println("el núnero central es "+num1);
		
		} else if (((num2 > num1) && (num2<num3)) || ((num2 > num3) && (num2<num1))){
			    System.out.println("el núnero central es "+num2);
		} else {
				System.out.println("el número central es "+num3);
		}
	}
}
