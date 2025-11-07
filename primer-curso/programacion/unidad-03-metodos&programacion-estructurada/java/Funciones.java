import java.util.Scanner;

public class Funciones{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int numero1 = pedirNumero();
		int numero2 = pedirNumero();

		System.out.println("El primer numero es "+ numero1);
		System.out.println("El segundo numero es "+ numero1);
	}

	public static int pedirNumero(){
		System.out.println("Introduzca un numero: ");
		int numero = Integer.parseInt(teclado.nextLine());

		return numero;
	}
}