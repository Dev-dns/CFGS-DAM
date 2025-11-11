import java.util.Scanner;
public class ArrayFunciones{

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){

		int[] arr1 = {6,2,5,6,8,12,39,10};
		int[] arr2 = {0,7,2,5,7,7,191,100};
		int[] arr3 = {46,4,54,6,7,62,1,6};

		mostrarArray(arr1);
		mostrarArray(arr2);
		mostrarArray(arr3);

	}


	public static void mostrarArray(int[] arr){

		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.print("\n");
	}

} 
