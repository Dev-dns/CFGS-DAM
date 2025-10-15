import java.util.Scanner;

public class SumaPositivos{
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
		int suma = 0;
		int num;
		System.out.print("Introduzca numeros positivos o 0 para acabar\n---------\n");

		do{
		System.out.print("Numero: ");
		num = Integer.parseInt(teclado.nextLine());	
		if(num < 0){
			System.out.println("No inserte numeros negativos");
			continue;
		}else{
			suma += num;	
		}

		}while(num != 0);

		System.out.println("La suma total es: " + suma);

	}

}