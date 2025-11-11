import java.util.Scanner;
public class ArrayFunciones4{

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){

		int[] arr1 = obtenerIntArray(10);
		int[] arr2 = obtenerIntArray(12);
		int[] arr3 = obtenerIntArray(2);


	}

	public static int[] obtenerIntArray(int tamaño){
		int[] arr = new int[tamaño];
		System.out.println("\nArray de tamaño: "+tamaño);
		for(int i = 0; i < arr.length;i++){
			System.out.print("Inserte el "+(i+1)+"º para el array: ");
			arr[i] = input.nextInt();
		}
		return arr;

	}

	public static void mostrarArray(int[] arr){
		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.print("\n");
	}


} 
