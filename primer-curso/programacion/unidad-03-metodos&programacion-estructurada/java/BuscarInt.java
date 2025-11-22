import java.util.Scanner;
public class BuscarInt{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		int[] arr = {6,2,5,7,1,6,7,10};
		buscarInt(arr,pedirEntero("Inserte el numero a buscar: "));
		mostrarArray(arr);

	}
	public static void buscarInt(int[] arr, int num){
		boolean apar = false;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == num){
				System.out.println("El numero "+num+" aparece en el array en el indice "+i);
				apar = true;
				break;
			}
		}
		if(apar == false){
			System.out.println("El numero "+num+" no aparece en el array.");
		}
	}
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
	public static void mostrarArray(int[] array){
		String texto = "";
		for(int i = 0;i < array.length;i++){
			if(i == array.length-1){
				texto+=array[i] + " ";
			}else{
				texto+=array[i] + ", ";
			}
		}
		System.out.print(texto + "\n");

	}
}