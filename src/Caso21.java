import java.util.Scanner;
public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float gasto, disminuido, total ;
		
		System.out.println("Ingrese el valor del gasto: ");
		gasto = sc.nextFloat();
		
		disminuido = gasto * 0.12f ;
		total = gasto - disminuido ;
		
		System.out.println(">> RESULTADO <<");
		System.out.println("El 12% del gasto es: "+ disminuido);
		System.out.println("El gasto disminuido en 12% es: "+ total);
		

	}

}
