import java.util.Scanner;

public class TablaMultiplicar{

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);


		System.out.print("Indica el numero que quiera: ");

		int numero = Integer.parseInt(teclado.nextLine());

		System.out.println("\nTabla de multiplicar del " +numero+ "\n--------------\n");

		for(int i = 1; i <= 10; i++){

			System.out.println(numero +  " * " + i + " = " + (numero*i));

		}

		System.out.println("\nFin del programa");

	}

}