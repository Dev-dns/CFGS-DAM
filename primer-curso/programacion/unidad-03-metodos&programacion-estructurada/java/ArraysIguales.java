import java.util.Scanner;
public class ArraysIguales{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		int[] arr1 = {5,6,1};
		int[] arr2 = {5,6,1};
		vectoresIntIguales(arr1,arr2);
	}
	
	public static void mostrarArray(int[] array,String enunciado){
		String texto = enunciado + " \n";
		for(int i = 0;i < array.length;i++){
			if(i == array.length-1){
				texto+= array[i] + " ";
			}else{
				texto+= array[i] + ", ";
			}
		}
		System.out.print(texto + "\n");
	}
	public static void vectoresIntIguales(int[] arr1, int[] arr2){
		boolean igual = true;
		mostrarArray(arr1,"Array 1");
		mostrarArray(arr2,"Array 2");
		if(arr1.length != arr2.length){
			igual = false;
		}
		if(igual == false){
			System.out.println("Los arrays no son iguales");
			return;
		}else{
			for(int i = 0;i < arr1.length;i++){
				if(arr1[i] != arr2[i]){
					igual = false;
					break;
				}
			}
		}
		if(igual == true){
			System.out.println("Los arrays son iguales");
		}else{
			System.out.println("Los arrays no son iguales");
		}
	}
}