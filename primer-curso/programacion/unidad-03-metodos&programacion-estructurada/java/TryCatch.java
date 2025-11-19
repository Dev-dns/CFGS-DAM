import java.util.Scanner;

public class TryCatch{

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		//Sin tratamiento de excepciones


		//Con tratamiento de excepciones

		try{

			System.out.print("Introduce un numero: ");
			int numero = teclado.nextInt();
			System.out.println("El numero es " + numero);
		}catch (Exception e){
			//Con esta linea el programa no se dentendrá, seguira corriendo
			//Aun printeando el error
			e.printStackTrace();
			System.out.println("El valor puede que no sea un entero.");
		}

		System.out.println("\nFIN DE PROGRAMA");

	} 

}