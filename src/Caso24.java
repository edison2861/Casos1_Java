import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Ingrese el primer monto: ");
		float monto1 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo monto: ");
		float monto2 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo monto: ");
		float monto3 = sc.nextFloat();
		
		float rpta1, rpta2, rpta3 ;
		
		rpta1 = monto1 / 2 + (0.2f * monto2);
		rpta2 = monto3 * 0.60f / 2 + (monto3);
		rpta3 = (monto1 + monto2 + monto3) - (monto1 + monto2 + monto3) * 0.08f;
		
		System.out.println(">>RESULTADO<<");
		System.out.println("Respuesta 1: "+ rpta1);
		System.out.println("Respuesta 2: "+ rpta2);
		System.out.println("Respuesta 3: "+ rpta3);
		

	}

}
