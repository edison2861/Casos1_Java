import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Ingrese el nombre del alumno: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese la nota 1: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese la nota 1: ");
		float cantidad = sc.nextFloat();
		
		float importe, igv, dscto, total ;
		
		importe = precio * cantidad ;
		igv     = 0.18f   * importe ;
		dscto   = 0.03f   * importe;
		total   = importe + dscto + igv ;
		
		System.out.println(">> RESULTADO <<");
		System.out.println("Importe: "+ importe);
		System.out.println("IGV: "+ igv);
		System.out.println("Descuento: "+ dscto);
		System.out.println("Total: "+ total);
				
	}

}
