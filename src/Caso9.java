import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float lado1, lado2 ;
		
		System.out.print("Ingrese la base del rectángulo: ");
		lado1 = sc.nextFloat();
		
		System.out.print("Ingrese la altura del rectángulo: ");
		lado2 = sc.nextFloat();
		
		float area, perimetro;
		area      = lado1 + lado2 ;
		perimetro = lado1 * lado2 ;
		
		System.out.println("--Respuesta--");
		System.out.println("Area.......:"+ area);
		System.out.println("Perimetro..:"+ perimetro);
		
	}

}
