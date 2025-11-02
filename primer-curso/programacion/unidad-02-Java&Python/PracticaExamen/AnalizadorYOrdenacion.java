import java.util.Scanner;
public class AnalizadorYOrdenacion{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		int[] numeros = {4,5,7,6,7,8,10};
		System.out.print("¿Que orden quieres utilizar (Ascendente (1) o Descendente (2))?: ");
		int opcion = teclado.nextInt();

		for(int i = 0; i < numeros.length;i++){
			for(int j = 0; j < numeros.length;j++){
				if ((opcion == 1 && numeros[i] > numeros[j]) 
			 		|| (opcion == 2 && numeros[i]< numeros[j])){
			 			int aux = numeros[i];
			 			numeros[i] = numeros[j];
			 			numeros[j] = aux;
			 		}
			}
		}
		for(int i : numeros){
			System.out.print(i+ " ");
		}

	} 
}
