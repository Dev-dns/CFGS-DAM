import java.util.Scanner;

public class Descuento{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un precio: ");
		int precio = Integer.parseInt(teclado.nextLine());

		System.out.print("Introduce el descuento a aplicar: ");
		int descuento = Integer.parseInt(teclado.nextLine());


		System.out.println("El precio con el descuento aplicado es: " + (precio-(precio*descuento/100)));



	}
}