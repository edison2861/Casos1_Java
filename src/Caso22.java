import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Ingrese el nombre del alumno: ");
		String alumno = sc.nextLine();
		
		System.out.print("Ingrese la nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese la nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese la nota 3: ");
		float nota3 = sc.nextFloat();
		
		float promedio;
		
		nota1 = nota1 * 0.20f;
		nota2 = nota2 * 0.30f;
		nota3 = nota3 * 0.50f;
		promedio = nota1 + nota2 + nota3 / 2 ;
		
		System.out.println(">> RESULTADO <<");
		System.out.println("Nombre del alumno: "+ alumno);
		System.out.println("Promedio: "+ promedio);
				
	}

}
