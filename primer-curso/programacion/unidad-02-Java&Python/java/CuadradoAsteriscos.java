import java.util.Scanner;

public class CuadradoAsteriscos{
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("DIBUJA TU CUADRADO\n----------\nInserte un numero, ese numero especificara el tamaño de los lados de dicho cuadrado\n--------\n");

		System.out.print("Inserte el tamaño del cuadrado: ");
		int lados = teclado.nextInt();

		//Printeamos la primera linea
		for(int i = 0; i < lados; i++){
			System.out.print("* ");
		}
		System.out.println();

		//Printeamos los lados con espacios
		for(int i = 0; i < lados-2; i++){
			System.out.print("* ");
			for(int j = 0; j < lados-2; j++){
				System.out.print("  ");
			}
			System.out.println("*");
		}
		//Printeamos la ultima linea
		for(int i = 0; i < lados; i++){
			System.out.print("* ");
		}
		System.out.println();
	}
}