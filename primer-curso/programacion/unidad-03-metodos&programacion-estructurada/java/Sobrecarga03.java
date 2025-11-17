import java.util.Scanner;

public class Sobrecarga03{

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int[] arr1 = {6,23,2,45,46,64,32,4};
		double[] arr2 = {-5.5,6.3,3,9.1,7.1};
		char[] arr3 = {'a','e','i','o','u'};
		String[] arr4 = {"paco","pepe","chimuelo","chimenea"};

		mostrarArray(arr1);
		mostrarArray(arr2);
		mostrarArray(arr3);
		mostrarArray(arr4);

	}

	//Definir y sobrecargar un metodo llamado mostrar array que muestre los valores de los arrays separados por coma

	public static void mostrarArray(int[] arr){
		String texto="";
		for(int i = 0; i < arr.length;i++){
			if (i != arr.length-1){
				texto+= arr[i] +", ";
			}else{

				texto+=arr[i] + " ";
			}
		}
		System.out.println(texto);

	}

	public static void mostrarArray(double[] arr){
		String texto="";
		for(int i = 0; i < arr.length;i++){
			if (i != arr.length-1){
				texto+= arr[i] +", ";
			}else{

				texto+=arr[i] + " ";
			}
		}
		System.out.println(texto);


	}
	public static void mostrarArray(char[] arr){
		String texto="";
		for(int i = 0; i < arr.length;i++){
			if (i != arr.length-1){
				texto+= arr[i] +", ";
			}else{

				texto+=arr[i] + " ";
			}
		}
		System.out.println(texto);

	}

	public static void mostrarArray(String[] arr){
		String texto="";
		for(int i = 0; i < arr.length;i++){
			if (i != arr.length-1){
				texto+= arr[i] +", ";
			}else{

				texto+=arr[i] + " ";
			}
		}
		System.out.println(texto);

	}

}