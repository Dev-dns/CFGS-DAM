import java.util.Scanner;
public class BinarioDecimal{
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args){
		
		int op;
		do{
			System.out.print("MENU\n------\n1 - Convertir de Decimal a Binario\n2 - Convertir de Binario a Decimal\n0 - Salir\n");
			do{
				op = pedirEntero("Inserte una opcion: ");
			}while(op != 1 && op!=2 && op!=0);


			int num;
			if(op == 0){
				System.out.println("Programa finalizado.");
				break;
			}else if(op == 1){
				do{
					num = pedirEntero("Inserte un numero decimal: ");
				}while(num < 0);

				String binar = decimalToBinario(num);
				System.out.println("El numero en binario es: "+binar);
			}else if(op == 2){
				String binario;
				do{
					System.out.print("Inserte un numero binario: ");
					binario = teclado.nextLine().trim();
				}while(comprobarBinario(binario) == false);

				int dec = binarioToDecimal(binario);
				System.out.println("El numero en decimal es: "+dec);
			} else{
				System.out.println("Opcion no valida: ");
				continue;
			}

		}while(true);



	}
	public static int pedirEntero(String enunciado){
		System.out.print(enunciado);
		int num;
		do{
			try{
				num = Integer.parseInt(teclado.nextLine());
				break;
			}catch(Exception e){
				System.out.print("El valor introducido tiene que ser un numero entero");
			}
		}while(true);
		return num;
	}
	public static String decimalToBinario(int num){
		String binario = "";
		String bina = "";
		
		if(num == 0) { return "0";}
		do{
			binario += num%2 ;
			num = num/2;
		}while(num > 0);

		for(int i = binario.length(); i > 0; i--){
			bina += binario.charAt(i-1);
		}

		return bina;
	}
	public static int binarioToDecimal(String binario){
		int decimal = 0 ;
		int ultimaPos = binario.length() -1;
		for(int i = 0; i < binario.length(); i++) {
			if(binario.charAt(i) == '1'){
					decimal += Math.pow(2,ultimaPos-i);
				}
		}

		return decimal;
	}
	public static boolean comprobarBinario(String binario){
		for(int i = 0; i < binario.length();i++){
			if((binario.charAt(i) != '1') && (binario.charAt(i) != '0')){
				return false;
			}
		}
		return true;
	} 
}