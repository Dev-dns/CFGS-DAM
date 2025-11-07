import java.util.Scanner;

public class Funciones5{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		String nombre = pedirDatos("Introduzca su nombre: ");
		String apellidos = pedirDatos("Introduzca sus apellidos: ");
		String email = pedirDatos("Introduzca su email: ");

		System.out.println("Tu nombre es "+nombre+" "+apellidos);
		System.out.println("Email : " +email);
		
	}

	public static String pedirDatos(String texto){
		System.out.print(texto);
		String dato = teclado.nextLine().trim();
		return dato;
	}
	
}