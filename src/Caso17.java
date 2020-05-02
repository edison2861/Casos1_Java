import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		double aprob, desap, retir ;
		
		System.out.println("Ingrese el número de aprobados: ");
		aprob = sc.nextFloat();
		
		System.out.println("Ingrese el número de desaprobados: ");
		desap = sc.nextFloat();
		
		System.out.println("Ingrese el número de retirados: ");
		retir = sc.nextFloat();
		
		double equivalente ;
		
		equivalente = aprob + desap + retir;
		aprob = (aprob / equivalente) * 100;
		desap = (desap / equivalente) * 100;
		retir = (retir / equivalente) * 100;
		
		System.out.println("--Respuesta--");
		System.out.println("Procentaje de Aprobados:    "+ df.format(aprob));
		System.out.println("Procentaje de Desaprobados: "+ df.format(desap));
		System.out.println("Porcentaje de Retirados :   "+ df.format(retir));
		
		
	}

}
