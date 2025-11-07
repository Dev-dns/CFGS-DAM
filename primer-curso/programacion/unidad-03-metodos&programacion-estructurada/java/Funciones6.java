import java.util.Scanner;

public class Funciones6{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		//Pedir 2 numeros con decimales a traves de un metodo
		double num1 = pedirNumero();
		double num2 = pedirNumero();

		//Llamar a un numero que los reciba y realice la division
		String texto = calcularDivision(num1,num2);

		//Mostrar por consola el resultado
		System.out.println(texto);
	}


	public static double pedirNumero(){
		System.out.print("Introduzca un numero: ");
		double num = teclado.nextDouble();
		return num;
	}
	public static String calcularDivision(double num1,double num2){
		String texto = num1 +" / "+num2 +" = "+ (num1/num2);
		return texto;

	}
	
	
}