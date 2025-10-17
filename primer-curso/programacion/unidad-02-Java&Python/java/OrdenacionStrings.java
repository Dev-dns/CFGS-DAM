import java.util.Scanner;
public class Ejercicio24{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		String[] nombres = {"Manolo","Pedrito","Eugenio","Eustaqui","Pancracito"};

		for(int i = 0; i < nombres.length; i++){
			for(int j = i+1; j< nombres.length; j++){
				if(nombres[i].compareToIgnoreCase(nombres[j]) > 0){
					String aux = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = aux;
				}
			}
		}

		for(int i = 0; i < nombres.length;i++){
			System.out.println(nombres[i] + " ");
		}

		System.out.println("\nFin de programa");

	}
}