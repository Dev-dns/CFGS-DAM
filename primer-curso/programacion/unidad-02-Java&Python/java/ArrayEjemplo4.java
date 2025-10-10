import java.util.Scanner;

public class ArrayEjemplo4{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres introducir: ");
		int cantidad = Integer.parseInt(teclado.nextLine());

		if(cantidad < 0){
			System.out.println("La cantidad no puede ser inferior a 0");
			System.exit(0);
		}

		int[] numeros = new int[cantidad];

		for(int i = 0 ; i < numeros.length;i++){
			System.out.println(i+1 + "ª numero: ");
			numeros[i] = Integer.parseInt(teclado.nextLine());

		}

		System.out.println("\n----------------");

		for(int i = 0 ; i < numeros.length;i++){

			System.out.println(numeros[i]);
		}
		



	}
}