import java.util.Scanner;
public class ArrayFunciones3{

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){

		System.out.print("Inserte el tamaño del array: ");
		int tamaño = input.nextInt();
		crearArray(tamaño);


	}

	public static void crearArray(int tamaño){
		int[] arr = new int[tamaño];

		for(int i = 0; i < arr.length;i++){
			System.out.print("Inserte el "+(i+1)+"º para el array: ");
			arr[i] = input.nextInt();
		}

	}

	public static void mostrarArray(int[] arr){
		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.print("\n");
	}


} 
