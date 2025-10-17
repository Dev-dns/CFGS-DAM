import java.util.Scanner;
public class BubbleShort{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] numeros = {4,2,6,1,0,9};
		int aux = 0;

		//Algoritmo de ordenacion bubble short, se van comparando los pares y cambiando las posiciones
		//Menor a mayor de izq a derecha
		for(int i = 1; i< numeros.length; i++){
			for(int j = 0; j < numeros.length-i; j++){
				if (numeros[j] > numeros[j+1]){
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}

		for(int i = 0; i < numeros.length;i++){
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nFin de programa");


		//Mayor a menor de izq derecha
		for(int i = 1; i< numeros.length; i++){
			for(int j = 0; j < numeros.length-i; j++){
				if (numeros[j] < numeros[j+1]){
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}


		for(int i = 0; i < numeros.length;i++){
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nFin de programa");

	}
}