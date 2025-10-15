import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("CALCULADOR DE FACTORIAL\n----------\nInserte un numero entero positivo para calcular su factorial | Para finalizar inserte -33\n----------\n");
		int factorial;
		int num = 0;


		while(0 != 1){
				System.out.print("Inserte el numero entero positivo: ");
			num = teclado.nextInt();
			if(num == -33){
				System.out.println("Programa finalizado");
				System.exit(0);
			}
			if(num < 0){
				System.out.println("El numero debe ser positivo o 0");
				continue;
			}
			if(num == 0){
				System.out.println("El factorial es: 1");
			}
			factorial = num;
			for(int i = num-1; i > 0; i--){
				if(i == 0){
					break;
				}
				factorial *= i;

			}
			System.out.println("El factorial es: " + factorial);

		}
		

	}
}