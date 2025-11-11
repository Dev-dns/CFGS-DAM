import java.util.Scanner;

public class ParImpar{
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		int num = pedirEntero();
		
		boolean parimpar = calcularParImpar(num);
		if (parimpar){
			System.out.println("El numero es par.");
		}
		else{
			System.out.println("El numero es impar.");
		}


	}

	public static int pedirEntero(){
		System.out.print("Introduzca un numero: ");
		int num = teclado.nextInt();
		return num;
	}
	public static boolean calcularParImpar(int num){
	
	/* opcion 1
		if (num%2==0){
			return true;
		}else{
			return false;
		}
	}
	*/
		
	//opcion 2

	return numero%2==0;
}