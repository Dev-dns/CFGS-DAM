import java.util.Scanner;
public class BubbleShort2{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] numeros = {4,2,6,1,0,9};
		int aux = 0;

		for(int i = 0; i < numeros.length;i++){
			System.out.print(numeros[i] + " ");
		}

		//Algoritmo burbuja (Version profesor)
		for(int i = 0; i< numeros.length; i++){
			//La j toma el valor de i mas uno, porque sera el segundo numero comparado
			//Cuando la i sea 0, la j sera 1, etc
			//Para que el algoritmo cambie de Ascendente (>) a Descendente (<), tendremos que cambiar en la linea 
			//de comparacion del codigo, el mayor que por el menor que o al reves
			for(int j = i+1; j < numeros.length; j++){
				if(numeros[i] > numeros[j]){
				aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
				}
			}
		}

		System.out.println();

		for(int i = 0; i < numeros.length;i++){
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nFin de programa");

	}
}