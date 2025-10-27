public class GraficaNumeros{
	public static void main(String[] args){

		int[] numeros = {5,24,-1,6,-13,-5,-10,21};
		int menor = 100000000;

		//Asignamos el menor numero a la variable
		for(int i = 0; i < numeros.length; i++){
			if (numeros[i] < menor){
				menor = numeros[i];
			}
		}

		//Recorremos el array para imprimir los caracteres
		for(int i = 0; i < numeros.length;i++){
			//Si el numero es negativo o menor que 0 ejecutamos lo siguiente
			if (numeros[i] < 0){
				//Printeamos la primera parte de espacios
				for(int j = 0; j < (Math.abs(menor) - Math.abs(numeros[i]));j++){
					System.out.print(" ");
				}
				for(int j = 0; j < Math.abs(numeros[i]);j++){
					System.out.print("*");
				}
				System.out.print("|\n");
			}
			else if(numeros[i] >= 0){
				for(int j = 0; j < Math.abs(menor);j++){
					System.out.print(" ");
				}

				System.out.print("|");

				for(int j = 0; j < Math.abs(numeros[i]);j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}

		}

	}
}