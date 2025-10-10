import java.util.Scanner;

public class TresEnteros{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int[] enteros = new int[3];

		for (int i = 0; i < enteros.length; i++){
			System.out.print(i+1 + "º numero: ");
			enteros[i] = teclado.nextInt();

		}
		System.out.println("");

		for (int i = 0 ; i < enteros.length; i++){
			System.out.println(enteros[i]);
		}
	}
}