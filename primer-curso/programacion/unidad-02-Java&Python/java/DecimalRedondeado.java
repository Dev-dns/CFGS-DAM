import java.util.Scanner;

public class DecimalRedondeado{
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("REDONDEADOR DE DECIMALES\n----------\nInserte un numero (Con un . de separacion) y los decimales a redondear\nPara acabar el programa, introduzca 0 en el numero");
		double numero;
		int decimales;

		while(0 != 1){
			System.out.print("\nInserte un numero con decimales: ");
			numero = Double.parseDouble(teclado.nextLine());

			if(numero == 0.0){
				System.out.println("Programa finalizado");
				break;
			}

			System.out.print("Inserte los decimales a redondear: ");
			decimales = Integer.parseInt(teclado.nextLine());

			System.out.print("Numero redondeado: " + (Math.rint(numero*Math.pow(10,decimales))/Math.pow(10,decimales)) );
			
			
		}
	}
}