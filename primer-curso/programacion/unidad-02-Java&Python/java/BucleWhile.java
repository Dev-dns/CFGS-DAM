import java.util.Scanner;

public class BucleWhile{

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);


		String texto = "Esto es una cadena";


		//Realizaremos un bucle while para printear una cadena mientras que el caracter a printear no sea una 'a'
		int i = 0;
		while(i < texto.length() && texto.charAt(i) !='a') {

			System.out.print(texto.charAt(i));
			i++;
		}
		System.out.println("\nFin de programa");

	}
}