import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado ;
		
		System.out.println("Ingrese lado del cuadrado: ");
		lado = sc.nextInt();
		
		int area, perimetro ;
		
		area = lado * lado;
		perimetro = lado * 4 ;
		
		System.out.println("--Resultados--");
		System.out.println("Area........:"+ area);
		System.out.println("Perimetro...:"+ perimetro);
	}

}
