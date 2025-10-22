import java.util.Scanner;

public class Triangulo{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Indica la altura en lineas de un Triangulo: ");

		int altura = Integer.parseInt(teclado.nextLine());

		for(int i = 0; i < altura; i++){
			for(int j = 0; j < i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}



		System.out.println("Fin de programa");
	}
}