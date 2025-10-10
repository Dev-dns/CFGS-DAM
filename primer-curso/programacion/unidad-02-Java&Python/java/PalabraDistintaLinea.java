import java.util.Scanner;

public class PalabraDistintaLinea{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un texto: ");
		//Guardamos la variable sin espacios de por medio para luego poder printearla sin problemas
		String texto = teclado.nextLine().trim();

		
		System.out.println("El texto introducido es: " + texto);
		System.out.println("La longitud de la cadena es: " + texto.length());

		for(int i = 0; i < texto.length(); i++){

			//Utilizamos las comillas simples ' ' para indicar que se trata de un caracter
			if (texto.charAt(i) == ' ' || ){
				System.out.println("");
				//Si detectamos que el caracter es un espacio printeamos una nueva linea
				//Y seguimos a la siguiente vuelta con el continue
				continue;
			}

			//Con este método accedemos a un caracter en concreto de la cadena de caracteres
			System.out.print(texto.charAt(i));

			//Si detectamos que el bucle ha llegado a la ultima posicion, es decir texto.length() -1
			//Printeamos un espacio para que en terminal quede bien visto
			if (i == texto.length()-1){
				System.out.println("");
			}

		}

	}
		
}