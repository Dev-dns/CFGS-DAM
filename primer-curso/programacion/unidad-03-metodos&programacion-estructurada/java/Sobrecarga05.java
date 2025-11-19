import java.util.Scanner;

public class Sobrecarga05{
	public static Scanner teclado = new Scanner(System.in);

	
	//Aqui vemos un ejemplo de aunque los metodos devuelvan cosas diferentes
	//Si la firma, nombre(argumentos), es lo mismo, no funcionara.
	public static void main(String[] args){
		int resultado1 = division(8,3);
		double resultado2 = division2(8,3);

	}

	public static int division(int num1, int num2){
		return num1/num2;
	}

	public static double division2(int num1, int num2){
		return (double)num1/(double)nu
	}
}