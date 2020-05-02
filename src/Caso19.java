import java.util.Scanner;
public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Ingrese lado 1: ");
		float lado1 = sc.nextFloat();
		
		System.out.print("Ingrese lado 2: ");
		float lado2 = sc.nextFloat();
		
		System.out.print("Ingrese lado 3: ");
		float lado3 =  sc.nextFloat();
		
		float perimetro ;
		
		perimetro = lado1 + lado2 + lado3 ;
		
		System.out.println(">> Resultado <<");
		System.out.println("El perimetro del triángulo es: "+ perimetro);
		

	}

}
