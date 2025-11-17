import java.util.Scanner;

public class Sobrecarga02{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		System.out.print("Introduzca un numero entero: ");
		int num = pedirEntero();
		System.out.println("El numero introducido es "+ num);

		int num2 = pedirEntero("Introduce otro numero entero: ");
		System.out.println("El otro numero introducido es "+ num2);

		System.out.print("Introduzca el minimo para el entero: ");
		int min = pedirEntero();

		int num3 = pedirEntero("Introduce un numero que sea mayor al minimo: ", min);
		System.out.print("El numero introducido ha sido" +num3);
	}

	public static int pedirEntero(){
		int numero = Integer.parseInt(teclado.nextLine().trim());
		return numero;
	}

	public static int pedirEntero(String enunciado){
		System.out.print(enunciado);
		int numero = Integer.parseInt(teclado.nextLine().trim());
		return numero;
	}
	public static int pedirEntero(String enunciado, int min){
		int num;
		do{
			System.out.print(enunciado);
			num = Integer.parseInt(teclado.nextLine().trim());
			if (num < min){
				System.out.println("El numero introducido es menor al minimo establecido.");
			}
		}while(num < min);
		return num;
	}
}