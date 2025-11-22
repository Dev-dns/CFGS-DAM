import java.util.Scanner;
public class FrecuenciaNumero{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		int[] arr1 = crearArray(20);
		arr1 = inicArray(arr1);
		frecuenciaNumero(pedirEntero("Introduzca el numero para comprobar su frecuencia de aparicion: "),arr1);

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
	public static void frecuenciaNumero(int num, int[] array){
		int frec = 0;
		for(int i : array){
			if(i == num){
				frec++;
			}
		}
		mostrarArray(array);
		System.out.print("El numero " +num+" aparece "+frec+" veces en el array\n");
	}
	public static int[] crearArray(int tam){
		int[] arr1 = new int[tam];
		return arr1;
	}
	public static int[] inicArray(int[] array){
		for(int i = 0; i < array.length;i++){
			array[i] = (int)(Math.random()*10);
		}
		return array;
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