import java.util.Scanner;

public class RecorrerArrayInverso{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		int[] enteros = new int[10];

		for(int i = 0; i < enteros.length; i++){
			System.out.print("Introduzca el "+(i+1)+"º numero: ");
			enteros[i] = teclado.nextInt();
		}
		for(int i = enteros.length-1; i >= 0; i--){
			System.out.println("\nEl numero en indice "+i+" es: "+enteros[i]);
		}

	}
}
