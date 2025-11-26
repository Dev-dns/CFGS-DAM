import java.util.Scanner;
public class Rectangulo{
	public static String carac = "+";
	public static String espacios = " ";
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		int altura = pedirEntero("Inserte la altura del rectangulo (MIN - 3 | MAX - 15): ");
		String rectangulo = figura(altura);
		System.out.print(rectangulo);
	}
	public static int pedirEntero(String enunciado){
		int altura = 0;
			do{
				try{
					System.out.print(enunciado);
					altura = Integer.parseInt(teclado.nextLine());
					break;
				}catch(Exception e){
					System.out.println("El valor introducido tiene que ser un numero entero.");
				}
			}while(true);

		return altura;
	}

	public static String figura(int altura){
		String texto = "";
		if(altura < 3 || altura > 15){
			return "ERROR: La altura no puede ser menor que 3 o mayor que 15. Intentelo de nuevo.\n";
		}
		int espacio = calcularEspacios(altura);
		int anchura = calcularAnchura(altura);

		//Seccion rectangulo
			for(int i = 0;i < altura;i++){
				for(int j = 0;j < espacio;j++){
						texto+= espacios;
					}
				for(int j = 0; j < anchura;j++){
					texto+= carac ;
				}
				texto+= "\n";
			}
		return texto;
	}
	public static int calcularEspacios(int altura){
		int espacio = 0;
		if(altura >=3 && altura<=6){
				espacio = 5;
			}else if(altura >=7 && altura <= 12){
				espacio = 7;
			}else if(altura >=13 && altura <=15){
				espacio = 9;
			}
			return espacio;
	}
	public static int calcularAnchura(int altura){
		int anchura = 0;
		if(altura >=3 && altura<=5){
				anchura = 3;
			}else if(altura >=6 && altura <= 8){
				anchura = 5;
			}else if(altura >=9 && altura <=12){
				anchura = 7;
			}else if(altura >=13 && altura <=15){
				anchura = 9;
			}
		return anchura;
	}
}