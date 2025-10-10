import java.util.Scanner;

public class ComprobacionWhile{

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);



		int opcion = -1;
		int contador = 0;

		//Ahora estructuraremos el while para que sea infinito y solo salga si se cumple
		//cierta condicion
		while(true) {
			System.out.println("MENU\n1- Cargar fichero\n2 - Cargar fichero\n3 - Ver conexiones\n0 - cancelar\n\nSelecciona una opcion: ");
			int opcion = Integer.parseInt(teclado.nextLine());

			//Obligatoriamente en un bucle infinito tenemos que contar con un break que nos saque
			//del bucle
			if (opcion >= 0 && opcion <=3 || i== 5){
				break;
			}
			System.out.println("\n Opcion no valida. Intentelo de nuevo")

		}
		System.out.println("Opcion elegida" + opcion);
	}
}