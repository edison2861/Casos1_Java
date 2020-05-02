import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float promedio, aumento, disminuido;
		promedio = (n1 + n2) / 2;
		aumento = (float) (n1 * 1.2); // Aplicar CAST
		disminuido = (float) (n2 * 0.7);
		
		System.out.println("-- Resultados --");
		System.out.println("Promedio   : " + promedio);
		System.out.println("Aumento    : " + aumento);
		System.out.println("Disminuido : " + disminuido);
	}

}
