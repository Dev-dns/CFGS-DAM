import java.util.Scanner;

public class Sobrecarga01{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int num = pedirEntero();
		System.out.println("El numero introducido es "+ num);

		int num2 = pedirEntero("Introduce otro numero entero: ");
		System.out.println("El otro numero introducido es "+ num2);
	}

	public static int pedirEntero(){
		int numero = Integer.parseInt(teclado.nextLine().trim());
		return numero;
	}

	public static int pedirEntero(String enunciado){
		System.out.prnt(enunciado);
		int numero = Integer.parseInt(teclado.nextLine().trim());
		return numero;
	}
}