import java.util.Scanner;

public class Primos{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int[] intervalo = new int[2];


		System.out.print("Numeros Primos en un Intervalo\n----------\nInserte el 1º numero del intervalo y el 2º numero, en base a esos dos numeros, se calcularan los numeros primos que hay entre medias de los dos empezando contando a los mismos\nRecuerde que solo los numeros positivos pueden ser primos.\n\n");

		for(int i = 0; i < intervalo.length;i++){
			do{
			System.out.print("Inserte el "+(i+1)+"º numero: ");
			intervalo[i] = Integer.parseInt(teclado.nextLine());
			}while(intervalo[i] < 0);
		}
				
		for(int i = intervalo[0]; i <= intervalo[1]; i++){

			if (i%i==0 && i%1==0 && i%2!=0){
				System.out.println("El numero "+i+" es primo");
			}
		}


	}
}