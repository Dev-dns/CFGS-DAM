import java.util.Scanner;

public class Multiplos{
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
		
		//Hacemos un bucle que guarde en una variable el valor de el multiplo actual,
		//Gracias a eso verificaremos que sea hasta 3000 y lo haremos dinamico

		System.out.println("\n BUCLE WHILE\n");
		int multiploActual = 3;
		int w = 1;

		while(multiploActual <3000){
			multiploActual = 3 * w;
			w++;
			System.out.print(multiploActual+ ", ");
		}

		System.out.println("\n\n BUCLE FOR\n");
		//Lo podremos hacer tambien con un bucle for usando una variable de ciclosTotales
		//Donde podremos establecer el limite y el numero para sacar los multiplos

		int ciclosTotales = 3000/3;

		for(int j = 0; j <= ciclosTotales; j++){
			System.out.print(3*j+ ", ");
		}

		System.out.println("\n");
	}

}