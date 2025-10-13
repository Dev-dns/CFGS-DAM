import java.util.Scanner;

public class foreach2{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		String[] nombres = {"David", "paco" ,"navarrete" , "antonio"};

		//Bucle normal
		System.out.println("Bucle normal");
		for(int i = 0; i < nombres.length; i++){
			System.out.println((i+1) + "º:  " + nombres[i]);
		}

		System.out.println("\nBucle for-each");
		int i = 1;
		for(String nombre : nombres){
			System.out.println(i + "º: " + nombre);
		}

		System.out.println("\nFin de programa");


	}
}