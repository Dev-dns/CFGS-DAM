import java.util.Scanner;

public class Ejemplo15{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		String opcion;

		//Realizamos un do while que ejecuta constantemente las lineas que piden los comandos 
		//Si selecciona salir, se sale mientras que si selecciona copiar o crear se queda seleccionado
		//para en un futuro se puede implementar la funcionalidad
			do {
			System.out.println("Escribe el comando que quieres ejecutar o escribre 'Salir' para finalizar: ");
			opcion = teclado.nextLine().trim();


			if(opcion.equalsIgnoreCase("crear")){
				System.out.println("\nHas seleccionado CREAR");
			}else if (opcion.equalsIgnoreCase("copiar")){
				System.out.println("\nHas seleccionado COPIAR");
			}

		} while(!opcion.equalsIgnoreCase("salir"));

		System.out.println("\nFin de programa");

	}
}