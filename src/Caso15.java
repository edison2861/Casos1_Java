import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidad = 0 ;
		float precio = 0 ;
		
		System.out.print("Cantidad: ");
		cantidad = sc.nextInt();
		
		System.out.print("Precio: ");
		precio = sc.nextFloat();
		
		float importe_s, importe_d, importe_e ;
		
		importe_s = cantidad * precio ;
		importe_d = (float) (importe_s / 3.24) ; // Aplicar CAST
		importe_e = (float) (importe_s / 3.75) ; // Aplicar CAST
		
		System.out.println(">>> Resultados <<<");
		System.out.println("Importe en S/......: "+ importe_s);
		System.out.println("Importe en $/......: "+ importe_d);
		System.out.println("Importe en Euros...: "+ importe_e);
		
		
		
	}

}
