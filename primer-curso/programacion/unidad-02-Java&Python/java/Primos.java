import java.util.Scanner;

public class Primos{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero inicial: ");
		int inicio = Integer.parseInt(teclado.nextLine());
		System.out.print("Numero final: ");
		int fin = Integer.parseInt(teclado.nextLine());

		for(int i = inicio;i <= fin;i++){
			if (i == 1 || i == 2){
				System.out.println(i);
				continue;
			}

			if (i%2==0){
				continue;
			}


			boolean esPrimo = true;
			double raiz = Math.sqrt(i);

			for(int j = 3; j <= raiz;j+=2){
				if(i%j==0){
					esPrimo = false;
				}
			}

			if(esPrimo){
				System.out.println(i);
			}

		}

		



	}
}