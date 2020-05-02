import java.util.Scanner;
public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese valor de la venta: ");
		float venta = sc.nextFloat();
		
		float incremento, total ;
		
		incremento = venta * 0.42f;
		total = incremento + venta;
		
		System.out.println(">> RESULTADO <<");
		System.out.println("El incremento en 42% es: "+ incremento);
		System.out.println("La venta incrementada en 42% es: "+ total);
		
		
		
		
	}

}
