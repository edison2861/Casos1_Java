import java.util.Scanner;
			
public class Caso18 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	float base, altura, area;
	
	System.out.print("Ingrese la base del tri�ngulo: ");
	base = sc.nextFloat();
	
	System.out.print("Ingrese la altura del tri�ngulo: ");
	altura = sc.nextFloat();
	
	area = (base * altura) / 2 ;
	
	System.out.println("--Resultado--");
	System.out.println("El �rea del tri�ngulo es: "+ area);
	
	
	}

}
