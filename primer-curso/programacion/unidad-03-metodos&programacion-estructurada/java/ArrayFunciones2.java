import java.util.Scanner;
public class ArrayFunciones2{

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args){

		String texto = "";
		int[] arr1 = {6,2,5,6,8,12,39,10};
		int[] arr2 = {0,7,2,5,7,7,191,100};
		int[] arr3 = {46,4,54,6,7,62,1,6};

		texto = mostrarArray(arr1);
		System.out.print(texto);
		texto = mostrarArray(arr2);
		System.out.print(texto);
		texto = mostrarArray(arr3);
		System.out.print(texto);

	}


	public static String mostrarArray(int[] arr){
		String texto = "";
		for(int num : arr){
			texto += num + " ";
		}
		texto+= "\n";
		return texto;
	}

} 
