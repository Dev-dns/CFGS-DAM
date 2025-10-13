import java.util.Scanner;

public class foreach{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		//creamos un array de strings con ciertos valores
		String[] cars = {"Audi" , "BMW" , "FORD", "MAZDA"};


		//con esta modalidad del bucle for, creamos una variable de tipo string llamada car
		// la variable cogerá el valor del array cars para ir printeandose
		for(String car : cars){
			System.out.println(car);
		}
	}
}