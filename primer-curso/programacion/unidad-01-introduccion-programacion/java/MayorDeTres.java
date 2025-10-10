import java.util.Scanner;

public class MayorDeTres{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		double num1 = teclado.nextDouble();

		System.out.println("Introduzca un número: ");
		double num2 = teclado.nextDouble();

		System.out.println("Introduzca un número: ");
		double num3 = teclado.nextDouble();

		if(num1>num2 && num1>num3){
			System.out.println("El numero " + num1 + " es el mayor de los tres");
		} else if(num2>num1 && num2>num3){
			System.out.println("El número " + num2 + " es el mayor de los tres");
		} else if(num3>num1 && num3>num2){
			System.out.println("El número " + num3 + " es el mayor de los tres");
		} else if(num1 == num2 && num1 > num3) {
			System.out.println("El número " + num1 + " es el mayor de los tres"); 
		} else if(num3 == num2 && num3 > num1) {
			System.out.println("El numero " + num3 + " es el mayor de los tres");

		} else if(num1 == num3 && num1 > num2){
			System.out.println("El número " + num3 + " es el mayor de los tres");
		} else {
			System.out.println("Todos los números son iguales");
		}
	}
}