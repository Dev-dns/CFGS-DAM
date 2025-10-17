import java.util.Scanner;
public class EjercicioClase2{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		//Declaramos el array de enteros con tamaño 10 (0-9)
		int[] numeros = new int[10];

		//Pedimos al usuario que rellene el array con numeros enteros 
		for(int i = 0; i < numeros.length;i++){
			System.out.print("Introduzca el " + (i+1) + "º numero: ");
			numeros[i] = teclado.nextInt();
		}		

		//Hacemos un do while para asegurarnos que el usuario rellene la opcion 1 o 2
		int opcion = 0;
		do{
		System.out.print("\n¿De que manera quieres ordenar los numeros\n 1 - Ascendente (Menor a mayor) \n 2 - Descendente (Mayor a menor)\n: ");
		opcion = teclado.nextInt();
		}while(opcion != 1 && opcion !=2);


		//Realizamos el bucle del algortimo de ordenacion bubble short 
		for(int i = 0; i< numeros.length; i++){
			//La j toma el valor de i mas uno, porque sera el segundo numero comparado
			//Cuando la i sea 0, la j sera 1, etc
			for(int j = i+1; j < numeros.length; j++){
				if(
					(opcion == 1 && numeros[i] > numeros[j]) ||
					(opcion == 2 && numeros[i] < numeros[j])
				){
				int aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
				}
			}
		}

		//Printeamos el array una vez ya este ordenado
		for(int i = 0; i < numeros.length;i++){
				System.out.print(+ numeros[i] + " ");
		}




	System.out.println("\nFin de programa");

}
}