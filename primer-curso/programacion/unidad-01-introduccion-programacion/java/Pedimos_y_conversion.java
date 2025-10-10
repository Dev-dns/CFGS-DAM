import java.util.Scanner;

public class Conversionnumero{

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		//Guardamos los numeros como cadena de caracteres
		System.out.print("Introduce un numero entero: ");
		String numero1 = teclado.nextLine();
		System.out.print("Introduce un numero con decimal: ");
		String numero2 = teclado.nextLine();

		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);

		//Pasamos numero 1 previamente cadena de caracteres a numero entero con la orden parseint
		int num1 = Integer.parseInt(numero1);
		System.out.println("Numero 1 convertido a entero" + num1);

		//Pasamos numero 2 a double con parse double
		//Si pedimos el numero directo con double se rellenara con coma, mientras que si lo pedimos como cadena tendra que ser con punto
		double num2 = Double.parseDouble(numero2);
		System.out.println("Numero 2 pasado a double " + num2);

		//En una misma línea hemos podido recolectar una cadena de caracteres para posteriormente pasarla a tipo int y guardarla en la variable
		int numero1 = Integer.parseInt(teclado.nextLine());
		
		
		
	}
} 
