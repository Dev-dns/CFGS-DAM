import java.util.Scanner;

public class ArrayEjemplo5{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un texto: ");
		//Guardamos la variable sin espacios de por medio
		String texto = teclado.nextLine().trim();

		
		System.out.println("El texto introducido es: " + texto);
		System.out.println("La longitud de la cadena es: " + texto.length());


	}
}