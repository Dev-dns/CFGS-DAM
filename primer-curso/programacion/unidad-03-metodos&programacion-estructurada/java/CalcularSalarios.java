import java.util.Scanner;
public class CalcularSalarios{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		String opcion;
		do{
			double salario = calcularSalario(pedirEntero("Introduzca las horas realizadas por el trabajador: "));
			System.out.println("El salario total ha sido: "+salario);
			System.out.print("¿Quiere seguir calculando? ('s' para seguir): ");
			opcion = teclado.nextLine();
		}while(opcion.equals("s"));
	}
	public static double calcularSalario(int horas){
		double salario = 0;
		if(horas < 35){
			salario = horas*15;
		}else if (horas >=35){
			horas = horas - 35;
			salario = 35 * 15;
			salario += horas * 22;
		}
		return salario;
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
}