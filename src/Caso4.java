import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// Instancia
		Scanner sc = new Scanner(System.in);
		
		// Definir las variables
		float n1 = 0;
		float n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float suma, resta;
		suma = n1 + n2;
		resta = n1 - n2;
		
		System.out.println("-- Resultados --");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);

	}

}
