import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float r = 0 ;
		
		System.out.print("Ingrese el radio del círculo: ");
		r = sc.nextFloat();
		
		double area, perimetro ;
		
		area = 2 * (3.1416 * r); 
		perimetro = 3.1416 * (r*r) ;		
		
		System.out.println("--Resultado--");
		System.out.println("Perimetro:..."+ perimetro);
		System.out.println("Area:........"+ area);
		
	}

}
