import java.util.Scanner;

public class AnalizadroNotasClase{
	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		
		while (true){

			int numero = 0;
			double nota = 0;
			int opcion = 0;

			do{
				System.out.print("¿Cuántas notas quieres introducir?: ");
				numero = Integer.parseInt(teclado.nextLine());
			}while(numero <= 0);

			double[] notas = new double[numero];

			for(int i = 0;i < numero;i++){
				do{
					System.out.print("Introduzca la "+(i+1)+"º nota: ");
					nota = Double.parseDouble(teclado.nextLine());
				}while(nota < 0 || nota > 10);
				notas[i] = nota;
			}

			while (true){

				do{
					System.out.print("\nAcciones Disponibles\n----------\n1 - Mostrar todas las notas\n2 - Calcular la nota media\n3 - Mostrar la nota mas alta\n4 - Mostrar la nota mas baja\n5 - Buscar una nota (Inserte una nota y le decimos si esta en la lista y cuantas veces)\n6 - Salir \nIntroduzca su opcion:");
					opcion = Integer.parseInt(teclado.nextLine());
				}while(opcion < 1 || opcion > 6);	

				if (opcion == 6){
					System.out.print("Programa finalizado\n");
					System.exit(0);
				}else if (opcion == 1){
					for(double i : notas){
						System.out.print(i+" ");
					}
				}else if (opcion == 2){
					int suma = 0;
					for(double i : notas){
						suma+=i;
					}
					System.out.println("La nota media es: "+(suma/numero));
				}else if (opcion == 3){
					double max = 0;
					for(double i : notas){
						if (i > max){
							max = i;
						}
					}
					System.out.println("La nota máxima introducida ha sido: "+max);
				}else if (opcion ==4){
					double min = 10;
					for(double i : notas){
						if (i < min){
							min = i;
						}
					}
					System.out.println("La nota minima introducida ha sido: "+min);
				}else if(opcion == 5){
					boolean esta = false;
					System.out.print("Inserte el numero a buscar: ");
					double buscar = Double.parseDouble(teclado.nextLine());
					for(double i :notas){
						if (i == buscar){
							esta = true;
							break;
						}
					}
					if (esta == true){
						int cont = 0;
						for(double i : notas){
							if (i == buscar){
								cont++;
							}
						}
						System.out.println("El numero "+buscar+" aparece en la lista "+cont+" veces");
					}else{
						System.out.println("El numero "+buscar+" no aparece en la lista");
					}
				}




			}

		}
	}
} 
