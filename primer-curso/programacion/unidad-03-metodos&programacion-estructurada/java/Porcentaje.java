import java.util.Scanner;

public class Funciones7{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		double num1 = pedirDouble("Introduce un numero: ");
		double num2 = pedirDouble("Introduce un porcentaje a calcular: ");

		String porcentaje = calcularPorcentaje(num1,num2);
		System.out.println(porcentaje);

	}


	public static double pedirDouble(String parametro){
		System.out.print(parametro);
		double num = teclado.nextDouble();
		return num;
	}
	public static String calcularPorcentaje(double num1,double num2){

		String porcentaje = num2+"% de "+num1+" = "+(num1*(num2/100));
		return porcentaje;
	}	
	
}