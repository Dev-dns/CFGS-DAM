import java.util.Scanner;

public class Funciones3{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int numero1 = pedirNumero();
		int numero2 = pedirNumero();

		System.out.println("El primer numero es "+ numero1);
		System.out.println("El segundo numero es "+ numero1);

		print("Paco");
	}

	public static int pedirNumero(){
		System.out.println("Introduzca un numero: ");
		int numero = Integer.parseInt(teclado.nextLine());

		return numero;

	}


	public static void print(String texto){

		System.out.println(texto);
	}
}