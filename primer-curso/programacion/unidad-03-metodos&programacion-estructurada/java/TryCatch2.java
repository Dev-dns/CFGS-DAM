import java.util.Scanner;

public class TryCatch2{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){

		int numero = pedirEntero("Introduce un numero entero: ");
		System.out.println("El numero introducido es "+ numero);
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
				System.out.println("\nERROR: el valor introducido puede no ser un numero entero");

			}

		}while(true);

		return numero;
	}
}