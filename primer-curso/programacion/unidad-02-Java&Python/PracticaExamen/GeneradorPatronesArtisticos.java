import java.util.Scanner;

public class GeneradorPatronesArtisticos{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		int opcion;
		while(true){
			int altura = 0;
			do{
				System.out.print("\nGenerador de Patrones Artisticos\n-------------\nSeleccione la opción que quiera generar\n1 - Triangulo Rectangulo Creciente Alineado a la izquierda\n2 - Triangulo Rectangulo Creciente Alineado a la derecha\n3 - Triangulo Rectangulo Decreciente Alienado a la izquierda\n4 - Triangulo Rectangulo Decreciente Alienado a la derecha\n5 - Piramide centrada creciente\n6 - Piramide centrada decreciente\n7 - Cuadrado Hueco\n8 - Cuadrado Relleno\n9 - Rombo\n0 - Para acabar el programa\n-Seleccione su opcion: ");
				opcion = Integer.parseInt(teclado.nextLine());
			}while(opcion < 0 || opcion > 9);

			//Si la opcion es 0 salimos
			if (opcion == 0){
				System.out.print("Fin del programa\n");
				break;
			//Si la opcion es 1, triangulo creciente izquierda
			}else{

				while(altura <= 0){
					System.out.print("Inserte la altura (triangulo), tamaño de lado (cuadrado), anchura (rombo): ");
					altura = Integer.parseInt(teclado.nextLine());
				}

				if (opcion == 1){
				for(int i = 1;i <= altura;i++){
					for(int j = 0; j < i;j++){
						System.out.print("*");
					}
					System.out.print("\n");
				}
				//Si la opcion = 2, triangulo creciente a la derecha
				}else if (opcion == 2){
					for(int i = 1;i <= altura;i++){
						for(int j = 0; j < altura-i;j++){
							System.out.print(" ");
						}
						for(int j = 0; j < i;j++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
				//Si la opcion == 3, triangulo decreciente a al izq
				}else if (opcion ==3){
					for(int i = altura;i >= 0;i--){
						for(int j = 0; j < i;j++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
				//Si la opcion == 4, triangulo decreciente a la der	
				}else if (opcion == 4){
					for(int i = 0; i <altura;i++){
						for(int j = 0; j < i;j++){
							System.out.print(" ");
						}
						for(int j = 0;j < altura-i;j++){
							System.out.print("*");
						}
					System.out.print("\n");
					}
				//Si la opcion == 5, piramide centrada creciente		
				}else if (opcion == 5){
					for(int i = 1; i <= altura;i++){
						for(int j = 0; j < altura-i;j++){
							System.out.print(" ");
						}
						for(int j = 0; j < 2*i-1;j++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
				//Opcion == 6, piramide centrada decreciente
				}else if (opcion == 6){
					for(int i = altura; i >= 0;i--){
						for(int j = 0; j < altura-i;j++){
							System.out.print(" ");
						}
						for(int j = 0;j < 2*i-1;j++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
				//Cuadrado hueco
				}else if (opcion == 7){
					for(int i = 1; i <= altura; i++){
						for(int j = 1; j <= altura;j++){
							if (i == 1 || i == altura || j == 1 || j == altura){
								System.out.print("* ");
							}else{
								System.out.print("  ");
							}
						}
						System.out.print("\n");
					}
				// Cuadrado Hueco
				}else if(opcion == 8){
					for(int i = 1; i <= altura;i++){
						for(int j = 0; j < altura;j++){
							System.out.print("* ");
						}
					System.out.print("\n");
					}
				//Rombo
				}else if(opcion == 9){
					for(int i = 1; i <=altura;i++){
						for(int j = 1; j <= altura-i;j++){
							System.out.print(" ");
						}
						for(int j = 1;j <= 2*i-1;j++){
							System.out.print("*");
						}
						System.out.print("\n");
					}
					for(int i = altura-1; i >=0;i--){
						for(int j = 1; j <= altura-i;j++){
							System.out.print(" ");
						}
						for(int j = 1;j <= 2*i-1;j++){
							System.out.print("*");
						}
						System.out.print("\n");
					}

				}
				
			}
		} 		
	}
}


