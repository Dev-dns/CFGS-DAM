import java.util.Scanner;

public class Suma8{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int sum=0;

		for(int i= 0;i <8 ; i++){

			System.out.print("Introduzca el " + (i+1) + "º numero: ");
			sum += teclado.nextInt();

		}
		System.out.println("La suma es: " + sum);
	}
}