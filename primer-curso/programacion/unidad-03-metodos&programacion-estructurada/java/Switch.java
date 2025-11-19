import java.util.Scanner;

public class Switch{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){

		int opcion;
		String menu = "\nMENU\n----------\n1 - Abrir fichero\n2 - Enviar email\n3 - Denuncias de Nintendo\n0 - Salir\n\n";
		do{
			opcion = pedirEntero(menu);
			switch(opcion){
				case 1: 
					System.out.print("Esto abriría un fichero\n");
					break;
				case 2: 
					System.out.print("Esto abriria un email\n");
					break;
				case 3: 
					System.out.print("Muchas denuncias nintendo...\n");
					break;
				case 4:
					System.out.print("Opcion no valida.\n");
					break;
			}
		}while(opcion !=0);

		System.out.println("\nFIN DE PROGRAMA.");
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
