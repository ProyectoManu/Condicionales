import java.util.Scanner;

/**
 * 4. Algoritmo que pida los parámetros (a, b y c de tipo double) de dos rectas, 
correspondientes a su ecuación implícita (ax + by + c = 0), e indique si son coincidentes, 
paralelas o secantes. En el caso de que sean secantes, hay que indicar si son 
perpendiculares o no. 
 * @author Manuel López
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Recta 1");
		System.out.println("A1: ");
		float a1 = entrada.nextFloat();
		System.out.println("B1: ");
		float b1 = entrada.nextFloat();
		System.out.println("C1: ");
		float c1 = entrada.nextFloat();
		
		System.out.println("Recta 2");
		System.out.println("A2: ");
		float a2 = entrada.nextFloat();
		System.out.println("B2: ");
		float b2 = entrada.nextFloat();
		System.out.println("C2: ");
		float c2 = entrada.nextFloat();
		
		if ((a1/b1) != (b1/b2)) {
			System.out.println("Son secantes ");
			if ((a1/b1) == (-b2/a2)) {
				System.out.println("Son perpendiculares ");
				
			}
		} else {
			System.out.println("Son paralelas ");
			if ((a1/a2) == (c1/c2)) {
				System.out.println("Son coincidentes ");
				
			}
		}
	}
}
		
	
		


