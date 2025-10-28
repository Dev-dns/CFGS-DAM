import java.util.Scanner;

public class Fibonnaci{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int fibonnaci = 0;
		do{	
			System.out.print("Inserte el termino de la sucesion de Fibonnaci que quieres extraer: ");
			fibonnaci = Integer.parseInt(teclado.nextLine());
		}while(fibonnaci < 0);


		if(fibonnaci == 0){
			System.out.print("El termino 0 es = 0\n");
			System.exit(0);
		} else if (fibonnaci == 1){
			System.out.print("El termino 1 es = 1\n");
			System.exit(0);
		}


		int[] fibonnacii = new int[fibonnaci+1];
		fibonnacii[0] = 0;
		fibonnacii[1] = 1;
		for(int i = 2; i <= fibonnaci; i++){
			fibonnacii[i] = fibonnacii[i-1] + fibonnacii[i-2];
		}

		System.out.print("El termino "+ fibonnaci+" es: "+fibonnacii[fibonnaci]+"\n");
	}
}