import java.util.Scanner;

public class AccesoCaracterCadena{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un texto: ");
		//Guardamos la variable sin espacios de por medio para luego poder printearla sin problemas
		String texto = teclado.nextLine().trim();

		
		System.out.println("El texto introducido es: " + texto);
		System.out.println("La longitud de la cadena es: " + texto.length());

		for(int i = 0; i < texto.length(); i++){
			//Con este método accedemos a un caracter en concreto de la cadena de caracteres
			System.out.println(texto.charAt(i));
		}


	}
}