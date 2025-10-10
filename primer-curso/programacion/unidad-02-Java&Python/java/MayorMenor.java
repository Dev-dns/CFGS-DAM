import java.util.Scanner;

public class MayorMenor{

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		//Pedimos 10 numeros y guardamos el mayor y menor de todos

		int mayor = 0;
		int menor = 0;

		for(int i = 1; i <=10 ; i++){
			System.out.print(i + "º numero: ");
			int num = Integer.parseInt(teclado.nextLine());

			if (i == 1){

				mayor = num;
				menor = num;
				//Finaliza la vuelta actual del bucle y continua con la siguiente
				continue;
			}

			if(num > mayor){
				mayor = num;
			}
			if(num < menor){
				menor = num;
			}

		}
		System.out.println("El mayor numero es: " + mayor);
		System.out.println("El menor numero es: " + menor);
	}
}