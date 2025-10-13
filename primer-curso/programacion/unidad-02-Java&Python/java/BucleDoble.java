import java.util.Scanner;

public class BucleDoble{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		//Bucle for doble
		for(int i = 1; i <= 10; i++){

			System.out.println("\nTabla de multiplicar del: " + i);
			for(int j = 1; j <= 10; j++){
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

		System.out.println("Fin de programa");
	}
}