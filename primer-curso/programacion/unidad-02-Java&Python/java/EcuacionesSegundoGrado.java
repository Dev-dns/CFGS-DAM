import java.util.Scanner;

public class EcuacionesSegundoGrado{
	public static void main(String[] args){

			Scanner teclado = new Scanner(System.in);
			double d,x,y;
			int opcion = 0;
		do{
		
			System.out.print("Introduzca la variable a de la ecuacion: ");
			double a = teclado.nextInt();
			System.out.print("Introduzca la variable b de la ecuacion: ");
			double b = teclado.nextInt();
			System.out.print("Introduzca la variable c de la ecuacion: ");
			double c = teclado.nextInt();

			if(a == 0 && b == 0){
				System.out.print("La ecuacion es degenarada, no se puede proseguir\n");
			}else if(a ==0 && b!=0){
				System.out.print("El resultado de la ecuacion es: "+((c*-1)/b));
			}else{
				d = b*b - (4*a*c);
				if(d >= 0){
					double x1 = (b*-1 + Math.sqrt(d)) / (2*a);
					double x2 = (b*-1 - Math.sqrt(d)) / (2*a);
					System.out.println("La x1 es: "+ x1);
					System.out.println("La x2 es: "+ x2);
				}else if(d < 0){
					System.out.println("No tiene estructuras reales");
		
				}
			}

			System.out.println("¿Quieres calcualar otra ecuacion? (1 = si | != 1 = no): ");
			opcion = teclado.nextInt();
		}while(opcion == 1);
		
	}
}