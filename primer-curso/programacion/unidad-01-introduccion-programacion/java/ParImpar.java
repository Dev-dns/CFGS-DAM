import java.util.Scanner;

public class ParImpar{

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero entero: ");
		int num = Integer.parseInt(teclado.nextLine());

		if(num%2 == 0){
			System.out.println("El numero es par");

		}
		else{
			System.out.println("El numero es impar");
		}
	}
}