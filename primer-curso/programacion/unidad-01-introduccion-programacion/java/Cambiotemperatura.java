import java.util.Scanner;

public class Cambiotemperatura {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Inserte una temperatura en Celsius: ");
		int gradoscel = Integer.parseInt(teclado.nextLine());

		System.out.println(gradoscel + "C en Fahrenheit es: " + ((gradoscel * 9/5)+32));
	}
}