import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int num;
		int factoria;
			do{
				System.out.print("Introduzca un numero para calcular su Factorial: ");
				num = teclado.nextInt();

				if(num < 0){
					System.out.print("ERROR: el numero no puede ser negativo");
				}
			}while(num < 0);

			if (num == 0 || num ==1){
				System.out.print(num + "! = 1");
			}else{
				factoria = 1;
				System.out.print(num+"! = ");
				for(int i = 1; i <= num;i++){
					factoria *= i;
					System.out.print(i);
					if (i < num){
						System.out.print(" x ");
					}
				}
				System.out.print(" = "+factoria+"\n");
			}

	}
} 
