import java.util.Scanner;

public class Trycatch3{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		int min=10;
		int max=20;

		int numero = pedirEntero("Introduce un numero entero: ");
		System.out.println("El numero introducido es "+ numero);

		int numero2 = pedirEntero("Introduce un numero entero: ",min,max);
		System.out.println("El numero introducido es "+ numero2);
	}

	//Asi blindamos la integridad del programa, haciendo que si o si se introduza un numero entero con el try catch
	public static int pedirEntero(String enunciado){
		int numero;
		
		do{
			System.out.print(enunciado);
			try{
				numero = Integer.parseInt(teclado.nextLine().trim());
				break;
			}catch(Exception e){
				System.out.println("\nERROR: el valor introducido puede no ser un numero entero\n");

			}

		}while(true);

		return numero;
	}

	public static int pedirEntero(String enunciado, int min, int max){
		int num;
		//Definimos una excepcion personalizada en el caso de que el minimo sea mayor o igual que el maximo
		if (minimo>= maximo){
			throw new ArithmeticException("\nError: El minimo no puede ser menor que el maximo");
		}

		do{
			num = pedirEntero(enunciado);

			if(num < min || num > max){
				System.out.print("ERROR: Los numeros tienen que esta entre el minimo y el maximo permitido\n");
			}
		}while(num < min || num > max);
		return num;
	}
}