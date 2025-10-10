import java.util.Scanner;

public class calculadora{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("CALCULADORA DNS 1.0\n----------------\n\n1 - Suma\n2 - Resta\n3 - Multiplicacion\n4 - Division\n\nSeleccione el numero para ejecutar la operacion: ");
		int elegir = Integer.parseInt(teclado.nextLine());

		if(elegir <= 0 || elegir > 4){

			System.out.println("La operacion introducida no es valida");
			System.exit(0);
		}

		System.out.print("Introduzca el primero numero con el que calcularemos: ");
		int num1 = Integer.parseInt(teclado.nextLine());

		System.out.print("Introduzca el primero numero con el que calcularemos: ");
		int num2 = Integer.parseInt(teclado.nextLine());

		if (elegir == 1){
			System.out.println(num1 +" + " +num2+ " = " + (num1+num2));
		}
		else if (elegir == 2){
			System.out.println(num1 +" - " +num2 +" = " + (num1-num2));
		}
		else if (elegir == 3){
			System.out.println(num1 +" * " +num2 +" = " + (num1*num2));
		}
		else if (elegir == 4){
			if (num2 <= 0){
				System.out.println("No se puede dividir entre 0");
				System.exit(0);
			}
			else{
				System.out.println(num1 +" / " +num2 +" = " + (num1/num2));
			}
		}
	}
}