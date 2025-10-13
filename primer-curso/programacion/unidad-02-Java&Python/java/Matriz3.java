import java.util.Scanner;

public class Matriz3{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);


		System.out.println("Numero de filas: ");
		int filas = Integer.parseInt(teclado.nextLine());
		System.out.println("Numero de columnas: ");
		int columnas = Integer.parseInt(teclado.nextLine());



		//Matrices
		int[][] numeros= new int[filas][columnas];


		for(int i = 0; i < numeros.length; i++){
			System.out.println("\n" + (i+1) + "º array interno");
		
			for(int j = 0; j < numeros[i].length; j++){
				System.out.print((j+1) + "º numero: ");
				numeros[i][j] = Integer.parseInt(teclado.nextLine());
			}

		}

		for(int i = 0; i < numeros.length; i++){
			//Sacamos la longitud de la segunda dimesion de cada valor con numeros[i].length
			for(int j = 0; j < numeros[i].length; j++){
			System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}



		System.out.println("\nFin de programa");

	}
}