import java.util.Scanner;

public class Matriz{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);


		//Matrices
		int[][] numeros= {
			{6,3,1,5},
			{0,1,5,1},
			{7,1,5,7},
			{9,5,2,1},
			{9,2,4,1}
		};


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