import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un dia de la semana para ver que tienes que hacer: ");

		//El .trim quitará los espacios del principio y final de los caracteres
		String dia = teclado.nextLine().trim();

		//Comprobacion de igual sin tener en cuando mayuscula o minuscula
		if(dia.equalsIgnoreCase("lunes")){
			System.out.println("FOL, Digi, Sistemas, Programacion");
		}else if(dia.equalsIgnoreCase("martes")){
			System.out.println("marcas, ingles, sistemas");
		}else if(dia.equalsIgnoreCase("miercoles")){
			System.out.println("FOL, programacion e ingles");
		}else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")){
			System.out.println("FOL, programacion e ingles");
		}else {
			System.out.println("Dia incorrecto");
		}
	}
}