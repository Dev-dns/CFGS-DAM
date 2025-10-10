import java.util.Scanner;

public class AdivinaPalabra {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Adivina la palabra: ");
		String texto = teclado.nextLine();
		final String PALABRA = "coche";


		//Texto equals devolverá o un true o un false dependiendo de los valores.
		if(texto.equals(PALABRA)){
			System.out.println("La palabra coincide");
		}else {
			System.out.println("La palabra NO coincide");
		}
	}
}