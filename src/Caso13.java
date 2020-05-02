import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		// Creado por Joe Castillo
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese apellido: ");
		String apellido = sc.nextLine();
		
		System.out.println(">> Resultados <<");
		System.out.println("Nombre y apellido: " + nombre + " " + apellido);
	}

}
