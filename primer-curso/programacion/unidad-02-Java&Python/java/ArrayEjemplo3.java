import java.util.Scanner;

public class ArrayEjemplo3{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		//Declaramos un array con unos valores especificados
		int[] numeros = {4,23,234,2,23};


		//Declaramos un array pero sin especificar una longitud precisa
		int[] numeros2 = new int[5];

		//Le asiganamos valores a los indices del array
		numeros[0] = 5;
		numeros[1] = 9;
		numeros[2] = 1023;
		numeros[3] = 29;
		numeros[4] = 20;


		int[] numeros3 = new int[3];

		for(int i = 0; i < numeros3.length; i++){

			System.out.println("Introduzca el primer numero: ");
			numeros3[i] = Integer.parseInt(teclado.nextLine());
		
		}

		for(int i = 0; i < numeros3.length; i++){

			System.out.println("\n-------------\n" + numeros3[i]);
		}




	}
}