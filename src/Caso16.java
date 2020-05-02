import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float horas, tarifa ;
		
		System.out.print("Ingrese horas trabajadas: ");
		horas = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por horas: ");
		tarifa = sc.nextFloat();
		
		double sueldo, bono, total, equivalente_d;
		
		sueldo = horas * tarifa;
		bono   = sueldo * 0.05 ;
		total  = sueldo + bono ;
		equivalente_d = total / 3.24 ;
		
		System.out.println("--Resultados--");
		System.out.println("Sueldo: "+ sueldo);
		System.out.println("Bono:   "+ bono  );
		System.out.println("Total:  "+ total );
		System.out.println("Total en dolares: "+ df.format (equivalente_d)) ;

	}

}
