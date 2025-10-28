import java.util.Scanner;
import java.util.Random;

public class AdivinarAleatorio{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();

		int numaleatorio = random.nextInt(100) + 1;
		int contador = 0;
		int numusuario;
		do{
			do{
				System.out.print("Inserte un numero del 1 al 100: ");
				numusuario = Integer.parseInt(teclado.nextLine());
				if (numusuario < 1 || numusuario > 100){
					System.out.print("Número no válido");
				}
			}while(numusuario < 1 && numusuario > 100);

			if(numusuario > numaleatorio){
				System.out.print("El numero del usuario es mayor que el numero oculto\n");
			}else if (numusuario < numaleatorio){
				System.out.print("El numero del usuario es menor que el numero oculto\n");
			}else if (numusuario == numaleatorio){
				System.out.print("Enhorabuena!. Has acertado el numero "+numaleatorio+"\n");
			}
			contador++;
		}while(numusuario != numaleatorio);

		System.out.print("El numero total de intentos ha sido: " +contador+"\n");

	}
}