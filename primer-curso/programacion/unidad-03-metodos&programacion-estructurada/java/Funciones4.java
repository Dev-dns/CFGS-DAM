import java.util.Scanner;

public class Funciones4{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		String nombre = pedirNombre();
		String apellidos = pedirApellidos();
		String email = pedirEmail();

		System.out.println("Tu nombre es "+nombre+" "+apellidos);
		System.out.println("Email : " +email);
		
	}

	public static String pedirNombre(){
		System.out.print("Introduzca su nombre: ");
		String nombre = teclado.nextLine().trim();
		return nombre;
	}
	public static String pedirApellidos(){
		System.out.print("Introduzca sus apellidos: ");
		String apellidos = teclado.nextLine().trim();
		return apellidos;
	}
	public static String pedirEmail(){
		System.out.print("Introduzca su email: ");
		String email = teclado.nextLine().trim();
		return email;
	}
	
}