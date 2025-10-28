import java.util.Scanner;

public class TipoTriangulo{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		int[] triangulo = new int[3];
		String opcion ="";

		while (1 != 0) {

			//Pedimos al usuario que introduzca los valores del tamaño de los lados 
			for(int i = 0; i < triangulo.length;i++){
				//Si el lado no es valido porque es igual o menor que 0, insistimos en que lo inserte
				do{
					System.out.print("Inserte el º"+(i+1)+" lado (Tiene que ser mayor que 0): ");
					triangulo[i] = Integer.parseInt(teclado.nextLine());
				}while(triangulo[i] <=0);
				
			}

			//Hacemos la segunda comprobacion de la suma de 2 lados cualquiera es mayor que el tercero
			if((triangulo[0] + triangulo[1] > triangulo[2]) && (triangulo[1] + triangulo[2] > triangulo[0]) && (triangulo[2] + triangulo[0] > triangulo[1])){
				//1º - Equilatero
				if((triangulo[0] == triangulo[1]) && (triangulo[1] == triangulo[2])){
					System.out.print("El triángulo es equilatero dado que sus lados son iguales.\n");
				//2º - Isosceles
				}else if ((triangulo[0] == triangulo[1]) || (triangulo[1] == triangulo[2]) || (triangulo[0] == triangulo[2])) {
					System.out.print("El triángulo es Isósceles ya que 2 de sus lados son iguales.\n");
				//3º Escaleno
				}else if ((triangulo[0] != triangulo[1]) && (triangulo[1] != triangulo[2]) && (triangulo[0] != triangulo[2])){
					System.out.print("El triángulo es Escaleno ya que sus tres lados son diferentes.\n");
				}
			}else{ //Si no son validos, damos el error y seguimos, para despues preguntar al usuario si quiere seguir, etc.
				System.out.print("Error: No son lados válidos | La suma de dos cualquiera de los lados debe ser mayor que el tercero\n");
				break;
			}

			do{
				System.out.print("¿Quieres repetir el programa? (s - si | n - no): ");
				opcion = teclado.nextLine().toLowerCase().trim();
			}while(!opcion.equals("s") && !opcion.equals("n"));

			if (opcion.equals("s")){
				continue;
			}else if (opcion.equals("n")){
				System.exit(0);
			}

		}
	}
} 
