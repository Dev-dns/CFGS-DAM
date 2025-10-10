import java.util.Scanner;

public class ComprobacionWhile{

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("MENU\n1- Cargar fichero\n2 - Cargar fichero\n3 - Ver conexiones\n0 - cancelar\n\nSelecciona una opcion: ");
		int opcion = Integer.parseInt(teclado.nextLine());

		if (opcion == 0){
			System.exit(0);
		}

		while(opcion < 1 || opcion > 3) {
			System.out.println("Seleccione una opción: ");
			opcion = Integer.parseInt(teclado.nextLine());
		}

	}
}