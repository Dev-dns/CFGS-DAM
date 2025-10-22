import java.util.Scanner;

public class Trianguloc{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Indica la altura en lineas de un Triangulo: ");

		int altura = Integer.parseInt(teclado.nextLine());

		for(int i = 1; i <= altura;i++){
			for(int j = 1; j <= altura-i;j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("Fin de programa");
	}
}