import java.util.Scanner;

public class DoWhile{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		int opcion;

		//Se ejecuta al menos una vez, ya que la condicion la comprueba al final
		//Cuando trabajemos con menu de opciones, lo mejor es do while.
		do {

			System.out.println("MENU\n1- Cargar fichero\n2 - Cargar fichero\n3 - Ver conexiones\n0 - cancelar\n\nSelecciona una opcion: ");
			int opcion = Integer.parseInt(teclado.nextLine());

		} while(opcion < 0 || opcion > 3);

	}
}