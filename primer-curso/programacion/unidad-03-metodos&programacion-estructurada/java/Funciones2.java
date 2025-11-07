import java.util.Scanner;

public class Funciones2{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int numero1 = pedirNumero("Introduce un numero: ");
		int numero2 = pedirNumero("Introduce otro numero: ");

		System.out.println("El primer numero es:  "+ numero1);
		System.out.println("El segundo numero es: "+ numero1);
	}

	public static int pedirNumero(String enunciado){
		System.out.print(enunciado);
		int numero = Integer.parseInt(teclado.nextLine());

		return numero;
	}
}