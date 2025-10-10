import java.util.Scanner;

public class Bisiesto{

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un año: ");
		int year = Integer.parseInt(teclado.nextLine().trim());

		if(year%4 == 0 && (year%100 != 0) || year%400 == 0 ){
			System.out.println("El año " + year + " es bisiesto");
		}else {
			System.out.println("El año " + year + " es no bisiesto");
					}

	}
}

