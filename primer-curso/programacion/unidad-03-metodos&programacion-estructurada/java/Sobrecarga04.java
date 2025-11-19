import java.util.Scanner;

public class Sobrecarga04{

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){

		int[] arr1 = {6,23,2,45,46,64,32,4};
		double[] arr2 = {-5.5,6.3,3,9.1,7.1};
		char[] arr3 = {'a','e','i','o','u'};
		String[] arr4 = {"paco","pepe","chimuelo","chimenea"};

		//Primer array - Crear ordenarArray() en sentido ascedente para cada tipo
		System.out.print("1º array ---------\n");
		mostrarArray(arr1);
		arr1 = ordenarArray(arr1);
		mostrarArray(arr1);

		//Segundo array - Crear ordenarArray() sobrecargado con un boolean para cada tipo
		System.out.print("2º array ---------\n");
		mostrarArray(arr2);
		arr2 = ordenarArray(arr2, false);
		mostrarArray(arr2);
		arr2 = ordenarArray(arr2);
		mostrarArray(arr2);

		//Tercer array 
		System.out.print("3º array ---------\n");
		mostrarArray(arr3);
		arr3 = ordenarArray(arr3,false);		
		mostrarArray(arr3);

		//Cuarto array - 
		System.out.print("4º array ---------\n");
		mostrarArray(arr4);
		arr4 = ordenarArray(arr4,false);
		mostrarArray(arr4);
		arr4 = ordenarArray(arr4,true);
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

	//Pasamos a definir las funciones de ordenacion

	public static int[] ordenarArray(int[] numeros){
		return ordenarArray(numeros,true);
	}
	public static double[] ordenarArray(double[] numeros){
		return ordenarArray(numeros,true);
	}

	public static char[] ordenarArray(char[] numeros){
		return ordenarArray(numeros,true);
	}

	public static String[] ordenarArray(String[] numeros){
		return ordenarArray(numeros,true);
	}

	public static int[] ordenarArray(int[] numeros, boolean sentido){
		for(int i = 0; i< numeros.length; i++){
			for(int j = i+1; j < numeros.length; j++){
				if(
					(sentido == true && numeros[i] > numeros[j]) ||
					(sentido == false && numeros[i] < numeros[j])
				){
				int aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
				}
			}
		}
		return numeros;
	}

	public static double[] ordenarArray(double[] numeros, boolean sentido){
		for(int i = 0; i< numeros.length; i++){
			for(int j = i+1; j < numeros.length; j++){
				if(
					(sentido == true && numeros[i] > numeros[j]) ||
					(sentido == false && numeros[i] < numeros[j])
				){
				double aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
				}
			}
		}
		return numeros;
	}

	public static char[] ordenarArray(char[] numeros, boolean sentido){
		for(int i = 0; i< numeros.length; i++){
			for(int j = i+1; j < numeros.length; j++){
				if(
					(sentido == true && numeros[i] > numeros[j]) ||
					(sentido == false && numeros[i] < numeros[j])
				){
				char aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
				}
			}
		}
		return numeros;
	}

	public static String[] ordenarArray(String[] numeros, boolean sentido){
		for(int i = 0; i< numeros.length; i++){
			for(int j = i+1; j < numeros.length; j++){
				if(
					(sentido == true && numeros[i].compareToIgnoreCase(numeros[j]) > 0) ||
					(sentido == false && numeros[i].compareToIgnoreCase(numeros[j]) < 0)
				){
				String aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
				}
			}
		}
		return numeros;
	}

}
